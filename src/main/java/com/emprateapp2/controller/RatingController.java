package com.emprateapp2.controller;


import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.emprateapp2.entity.Oceny;
import com.emprateapp2.entity.Pracodawcy;
import com.emprateapp2.entity.User;
import com.emprateapp2.ratingclasses.average;
import com.emprateapp2.ratingclasses.employersComparator;
import com.emprateapp2.service.OcenyService;
import com.emprateapp2.service.PracodawcyService;
import com.emprateapp2.service.UserService;


@Controller
@RequestMapping
public class RatingController {
	
	@Autowired
	private PracodawcyService pracodawcyService;
	@Autowired
	private UserService userService;
	@Autowired
	private OcenyService ocenyService;
	
	@GetMapping("/")
	public String homePage() {
		return "index";
	}
	@GetMapping("/companies")
	public String companies(Model theModel) {
		
		List<Pracodawcy> listaPracodawcow = pracodawcyService.getPracodawcy();

		theModel.addAttribute("pracodawcy",listaPracodawcow);
		
		return "companies-list";
	}
	
	@RequestMapping("/companies/showCompany")
	public String showCompany(@RequestParam("comId") int theId, Model theModel) {
	
		Pracodawcy pracodawca = pracodawcyService.getPracodawca(theId);
		
		theModel.addAttribute("pracodawca",pracodawca);
		
		double avg = average.SolveAverageRating(pracodawca.getOcenyList());
		
		theModel.addAttribute("avg",String.format("%.2f", avg));
		
		System.out.println(pracodawca.getID() + " " + pracodawca.getOpis());
		return "showCompany";
	}
	
	@GetMapping("/companies/addRating")
	public String addRating(@RequestParam("comId") int theId, Model theModel) {
		Oceny newOcena = new Oceny();

		theModel.addAttribute("ocena",newOcena);
		theModel.addAttribute("idprac",theId);
		return "add-rating";
				
	}
	@PostMapping("/companies/saveRating")
	public String saveRating(@RequestParam("comId") int theId, @ModelAttribute("ocena") Oceny theOcena) {
		Pracodawcy pracodawca = pracodawcyService.getPracodawca(theId);
		theOcena.setPracodawca(pracodawca);
		ocenyService.saveOceny(theOcena);
	
		return "redirect:/companies";
	}
	@RequestMapping("/ranking")
	public String ranking(Model theModel) {
		List<Pracodawcy> listaPracodawcow = pracodawcyService.getPracodawcy();
		System.out.println("Nie sort");
		for(Pracodawcy p1 : listaPracodawcow) {
			System.out.println(p1.getNazwa());
		}
		
		Collections.sort(listaPracodawcow, new employersComparator());
		System.out.println("Po sort");
		for(Pracodawcy p1 : listaPracodawcow) {
			System.out.println(p1.getNazwa());
		}
		theModel.addAttribute("pracodawcy",listaPracodawcow);
		
		return "companies-list";
		
	}
	@RequestMapping("/rl")
	public String registerAndLogin(Model theModel) {
		User newUser = new User();
		
		theModel.addAttribute("user",newUser);
		
		return "rlpage";
	}
	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User theUser) {
		userService.saveUser(theUser);
		
		return "redirect:/rl";
	}
	
	
	@RequestMapping("/myAccount")
	public String myAccount() {
		return "account";
	}
}
