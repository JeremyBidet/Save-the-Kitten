package fr.upem.main;

import fr.upem.gui.MainWindow;
import fr.upem.gui.elements.Area;
import fr.upem.gui.elements.Config;
import fr.upem.gui.windows.Game;
import fr.upem.gui.windows.Help;
import fr.upem.gui.windows.Level;
import fr.upem.gui.windows.Menu;
import fr.upem.gui.windows.Window;

public class Main {

	public static void main(String[] args) {

		//Application.run(Color.white, __ -> System.out.println("Hello world in app !"));

		/**
		 * Theses fields never change
		 */
		final Window menu = new Menu();
		final Window help = new Help();
		new Game();
		Game.addLevel(1, new Level(new Area(), new Config()));
		Game.addLevel(2, new Level(new Area(), new Config()));
		Game.addLevel(3, new Level(new Area(), new Config()));
		
		MainWindow mw = new MainWindow();
		mw.run();
		
	}

}