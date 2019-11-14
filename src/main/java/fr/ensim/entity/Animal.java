package fr.ensim.entity;

public class Animal {

	private String nomAnimal;
	private String typeAnimal;
	
	
	
	public Animal() {
		super();
	}
	public Animal(String nomAnimal, String typeAnimal) {
		super();
		this.nomAnimal = nomAnimal;
		this.typeAnimal = typeAnimal;
	}
	public String getNomAnimal() {
		return nomAnimal;
	}
	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}
	public String getTypeAnimal() {
		return typeAnimal;
	}
	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}
	@Override
	public String toString() {
		return "Animal [nomAnimal=" + nomAnimal + ", typeAnimal=" + typeAnimal + "]";
	}
	
	
	
	
}
