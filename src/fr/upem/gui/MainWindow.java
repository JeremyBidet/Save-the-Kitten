package fr.upem.gui;

import fr.upem.gui.windows.Game;
import fr.upem.gui.windows.Help;
import fr.upem.gui.windows.Menu;
import fr.upem.gui.windows.Window;

public class MainWindow {

	/**
	 * Not final, cause settings could change
	 */
	private MainWindowSetting settings = new MainWindowSetting();
	
	/**
	 * Theses fields never change
	 */
	private final Menu menu = new Menu();
	private final Game game = new Game();
	private final Help help = new Help();
	
	/**
	 * Not final cause window change from menu to help to level and vice-versa
	 */
	private Window window;
	
	public void menu() {
		window = menu;
	}
	
	public void level(int no_level) throws Exception {
		if(null == (window = Game.init(no_level))) {
			throw new Exception("Level " + no_level + " not found !");
		}
	}
	
	public void help() {
		window = help;
	}
	
	public void draw() {
		window.draw();
	}
	
}
