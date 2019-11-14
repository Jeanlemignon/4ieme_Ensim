package fr.ensim.entity;

public class Chien extends Animal {

	private String nomAnimal;
	
	public Chien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chien( String typeAnimal) {
		super("Chien", typeAnimal);
		// TODO Auto-generated constructor stub
		
		this.nomAnimal = "Chien";
	}

	public String getNomAnimal() {
		return this.nomAnimal;
	}
	
}
