package fr.ensim.entity;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private int visiteurs=0;
	private List<Secteur> secteursAnimaux = new ArrayList<Secteur>();
	
	
	
	public Zoo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getVisiteurs() {
		return visiteurs;
	}
	public void setVisiteurs(int visiteurs) {
		this.visiteurs = visiteurs;
	}
	public List<Secteur> getSecteursAnimaux() {
		return secteursAnimaux;
	}
	public void setSecteursAnimaux(List<Secteur> secteursAnimaux) {
		this.secteursAnimaux = secteursAnimaux;
	}
	
	public void ajouterSecteur(String secteur) {
		secteursAnimaux.add(new Secteur(secteur));
	}
	
	public void nouveauVisteur() throws LimiteurVisiteurException{
        
		if(visiteurs > getLimiteVisiteur()) {

		}
		else {
			visiteurs++;
		}			
	}
	
	public int getLimiteVisiteur() {
		return 15*secteursAnimaux.size();
	}
	
	public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
		
		for( Secteur s: secteursAnimaux) {
			if(s.getTypeAnimauxDansSecteur().equals(animal.getTypeAnimal())){
					s.ajouterAnimal(animal);
			}
		}
		
	}
	
	public int nombreAnimaux() {
		
		int nombre =0;
		for( Secteur s: secteursAnimaux) {
			nombre = + s.getNombreAnimaux();
		}
		
		return nombre;
	}
	
}
