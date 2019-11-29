package fr.ensim.entity;

public class Chat extends Animal {
	public Chat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chat( String typeAnimal) {
		super("Chat", typeAnimal);
		this.nomAnimal = "Chat";
		// TODO Auto-generated constructor stub
	}

	public String getNomAnimal() {
		return this.nomAnimal;
	}
}
