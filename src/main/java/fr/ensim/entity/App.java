package fr.ensim.entity;

import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

	//Log4j2
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	
	public static void main(String[] args) throws AnimalDansMauvaisSecteurException, LimiteurVisiteurException {
		// TODO Auto-generated method stub
		 
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
		
		//Log4J2
		
		for(int i=0; i<=15; i++)
		zoo.nouveauVisteur();
		
		
		System.out.println("nombre de secteur : " + zoo.getSecteursAnimaux().size());
		for(Secteur s : zoo.getSecteursAnimaux())
		{
			LOGGER.info("nombre d'animaux : " + s.getNombreAnimaux());
			LOGGER.trace("nombre d'animaux : " + s.getNombreAnimaux());
			LOGGER.debug("nombre d'animaux : " + s.getNombreAnimaux());
			LOGGER.warn("nombre d'animaux : " + s.getNombreAnimaux());
			LOGGER.error("nombre d'animaux : " + s.getNombreAnimaux(),new NullPointerException("NullError"));
			LOGGER.fatal("nombre d'animaux : " + s.getNombreAnimaux());
		}
		
		Collections.sort(zoo.getSecteursAnimaux(),new Secteur());
		for(Secteur s : zoo.getSecteursAnimaux())
		System.out.println("nombre d'animaux : " + s.getNombreAnimaux());
		
		System.out.println("le nombre d'animaux dans le Zoo: " + zoo.nombreAnimaux());

		System.out.println("le nombre de visiteurs dans le Zoo: " + zoo.getVisiteurs());
		
		
	}

}
