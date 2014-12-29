package fr.upem.main;

import java.awt.Color;

import fr.umlv.zen4.Application;

public class Main {

	public static void main(String[] args) {

		Application.run(Color.white, __ -> System.out.println("Hello world in app !"));
	}

}