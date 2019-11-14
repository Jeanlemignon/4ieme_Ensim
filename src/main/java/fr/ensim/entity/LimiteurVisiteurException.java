package fr.ensim.entity;

public class LimiteurVisiteurException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public LimiteurVisiteurException() {
		System.out.println("Le nombre maximal de visiteur est atteint");
	}

}
