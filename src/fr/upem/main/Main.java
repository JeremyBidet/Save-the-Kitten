package fr.upem.main;

import fr.upem.gui.MainWindow;
import fr.upem.gui.elements.Area;
import fr.upem.gui.elements.Config;
import fr.upem.gui.elements.ElementFactory;
import fr.upem.gui.windows.Game;
import fr.upem.gui.windows.Help;
import fr.upem.gui.windows.Level;
import fr.upem.gui.windows.Home;
import fr.upem.gui.windows.Window;

public class Main {

	public static void main(String[] args) {

		//Application.run(Color.white, __ -> System.out.println("Hello world in app !"));

		/**
		 * Theses fields never change
		 */
		final Window home = new Home();
		final Window help = new Help();
		final ElementFactory ef = new ElementFactory();
		new Game();
		Game.addLevel(1, new Level(new Area(ef.getCanon("Simple")), new Config()));
		Game.addLevel(2, new Level(new Area(ef.getCanon("Blast")), new Config()));
		Game.addLevel(3, new Level(new Area(ef.getCanon("Double")), new Config()));
		
		/**
		 * TODO:
		 */
		MainWindow mw = new MainWindow();
		mw.menu(home);
		mw.run();
		mw.menu(help);
		mw.run();
		try {
			mw.level(1);
			mw.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}