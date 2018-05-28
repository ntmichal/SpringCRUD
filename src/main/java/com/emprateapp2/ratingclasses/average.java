package com.emprateapp2.ratingclasses;

import java.util.List;

import com.emprateapp2.entity.Oceny;

public class average {

	public static double SolveAverageRating(List<Oceny> theOcena) {
		double avg = 0;
		for(Oceny category : theOcena) {
			avg += (double)(category.getKat1() + category.getKat2() + category.getKat3() + category.getKat4() + category.getKat5()) /5;
		
		}

		return avg/(double)theOcena.size();
	}
}
