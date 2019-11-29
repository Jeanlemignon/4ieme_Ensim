package fr.ensim.entity;

import java.util.Comparator;
public class SecteurComparator implements Comparator<Secteur> {

	public int compare(Secteur o1, Secteur o2) {
		// TODO Auto-generated method stub
		
		return o1.getNombreAnimaux()-o2.getNombreAnimaux();
	}

}
