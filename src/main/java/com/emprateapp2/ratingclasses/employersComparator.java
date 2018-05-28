package com.emprateapp2.ratingclasses;


import java.util.Comparator;

import com.emprateapp2.entity.Pracodawcy;

public class employersComparator implements Comparator<Pracodawcy>{

	@Override
	public int compare(Pracodawcy o1, Pracodawcy o2) {
	
		double oRate1 = average.SolveAverageRating(o1.getOcenyList()); 
		double oRate2 = average.SolveAverageRating(o2.getOcenyList());

	    if(Double.compare(oRate1, oRate2) == -1) return 1;
	    if(Double.compare(oRate1, oRate2) == 1) return -1;
	    return 0;
	}


}
