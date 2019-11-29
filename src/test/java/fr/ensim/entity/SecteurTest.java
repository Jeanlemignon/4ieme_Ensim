package fr.ensim.entity;

import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Test;

public class SecteurTest {

	@Test
	public void compareSecteurAnimal() throws AnimalDansMauvaisSecteurException {
		
		//preparation
		Zoo zoo = new Zoo();
		
		zoo.ajouterSecteur("oiseaux");
		zoo.ajouterSecteur("reptiles");
		zoo.ajouterSecteur("domestique");
		
		
		Chien chien1   = new  Chien("domestique");
		Chien chien2 = new Chien("oiseaux");
		
		Chat chat1 = new Chat("domestique");
		Chat chat2 = new Chat("domestique");
		
		
		zoo.nouvelAnimal(chien1);
		zoo.nouvelAnimal(chat1);
		zoo.nouvelAnimal(chien2);
		zoo.nouvelAnimal(chat2);
		
		assertEquals("methode avec sort", 1, zoo.getSecteursAnimaux().get(0).getNombreAnimaux());
		
		//execution
		Collections.sort(zoo.getSecteursAnimaux(),new Secteur(""));
		
		//verification
		assertEquals( "methode avec sort",0, zoo.getSecteursAnimaux().get(0).getNombreAnimaux());
		
		
	}

}
