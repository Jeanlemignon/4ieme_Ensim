package fr.ensim.entity;

public class AnimalDansMauvaisSecteurException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AnimalDansMauvaisSecteurException() {
		System.out.println("L animal ajout� est dans le mauvais secteur");
	}
}
