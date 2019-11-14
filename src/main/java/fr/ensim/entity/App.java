package fr.ensim.entity;

public class App {

	
	
	public static void main(String[] args) throws AnimalDansMauvaisSecteurException, LimiteurVisiteurException {
		// TODO Auto-generated method stub
		 
		Zoo zoo = new Zoo();
	
		zoo.ajouterSecteur("oiseaux");
		zoo.ajouterSecteur("reptiles");
		zoo.ajouterSecteur("domestique");
		
		
		Chien chien1   = new  Chien("domestique");
		Chien chien2 = new Chien("domestique");
		
		Chat chat1 = new Chat("domestique");
		Chat chat2 = new Chat("domestique");
		
		
		zoo.nouvelAnimal(chien1);
		zoo.nouvelAnimal(chat1);
		zoo.nouvelAnimal(chien2);
		zoo.nouvelAnimal(chat2);
		
		
		for(int i=0; i<=15; i++)
		zoo.nouveauVisteur();
		
		System.out.println("le nombre d'animaux dans le Zoo: " + zoo.nombreAnimaux());

		System.out.println("le nombre de visiteurs dans le Zoo: " + zoo.getVisiteurs());
		
		
	}

}
