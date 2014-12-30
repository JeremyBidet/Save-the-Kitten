package fr.upem.main;

import fr.upem.gui.MainWindow;
import fr.upem.gui.elements.Area;
import fr.upem.gui.elements.Config;
import fr.upem.gui.windows.Game;
import fr.upem.gui.windows.Level;

public class Main {

	public static void main(String[] args) {

		//Application.run(Color.white, __ -> System.out.println("Hello world in app !"));

		new Game();
		Game.addLevel(1, new Level(new Area(), new Config()));
		Game.addLevel(2, new Level(new Area(), new Config()));
		Game.addLevel(3, new Level(new Area(), new Config()));
		
		MainWindow mw = new MainWindow();
		mw.run();
		
	}

}