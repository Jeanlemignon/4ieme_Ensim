package fr.ensim.entity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Secteur implements Comparator<Secteur> {

	private String typeAnimauxDansSecteur;
	private List<Animal> animauxDansSecteur = new ArrayList<Animal>();
	
	
	public Secteur() {}
	public Secteur(String typeAnimauxDansSecteur) {
		super();
		this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
		
	}
	
	public void ajouterAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
		
		if(animal.getTypeAnimal().equals(typeAnimauxDansSecteur)) {
			animauxDansSecteur.add(animal);
		}else {
			throw new AnimalDansMauvaisSecteurException();
		}
		
	}
	
	public int getNombreAnimaux() {
		return animauxDansSecteur.size();
	}
	
	public String obtenirType() {
		return typeAnimauxDansSecteur;
	}

	public String getTypeAnimauxDansSecteur() {
		return typeAnimauxDansSecteur;
	}

	public void setTypeAnimauxDansSecteur(String typeAnimauxDansSecteur) {
		this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
	}

	public List<Animal> getAnimauxDansSecteur() {
		return animauxDansSecteur;
	}

	public void setAnimauxDansSecteur(List<Animal> animauxDansSecteur) {
		this.animauxDansSecteur = animauxDansSecteur;
	}

	@Override
	public String toString() {
		return "Secteur [typeAnimauxDansSecteur=" + typeAnimauxDansSecteur + ", animauxDansSecteur="
				+ animauxDansSecteur + "]";
	}

	public int compare(Secteur o1, Secteur o2) {
		// TODO Auto-generated method stub
		return o1.getNombreAnimaux()-o2.getNombreAnimaux();
	}
	
	
}
