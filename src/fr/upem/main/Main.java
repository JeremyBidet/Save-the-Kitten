package fr.upem.main;

import fr.umlv.zen3.Application;

public class Main {

	public static void main(String[] args) {
		
		Application.run("Hello app", 800, 600, __ -> System.out.println("Hello world in app !"));
	}

}
