package fr.ensim.entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZooTest {

	
	
	
	@Test
	public void testNouveauVisteur() throws AnimalDansMauvaisSecteurException, LimiteurVisiteurException {
		//preparation
		Zoo zoo = new Zoo();
		zoo.ajouterSecteur("Chien");
		
		Chien chien1   = new  Chien("domestique");
		zoo.nouvelAnimal(chien1);
		//execution
		for(int i=0; i<=14; i++)
			zoo.nouveauVisteur();
		
		//verification
		assertEquals(15, zoo.getVisiteurs());
	}
	

	@Test
	public void testNouvelAnimal() throws AnimalDansMauvaisSecteurException, LimiteurVisiteurException {
		//preparation
		Zoo zoo = new Zoo();
		zoo.ajouterSecteur("Chien");
		
		Chien chien1   = new  Chien("Chien");
		//execution
		zoo.nouvelAnimal(chien1);
		
		//verification
	assertEquals(1	,zoo.getSecteursAnimaux().get(0).getAnimauxDansSecteur().size() );
	}


}
