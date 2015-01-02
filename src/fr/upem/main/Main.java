package fr.upem.main;

import fr.upem.gui.MainWindow;
import fr.upem.gui.WindowSetting;

/**
 * Starting point for the application.<br>
 * Init the main window and call method run.
 * @see MainWindow
 * @author Jeremy
 * @author Melody
 */
public class Main {

	public static void main(String[] args) {

		MainWindow mainwindow = new MainWindow(new WindowSetting());
		mainwindow.run();
		
	}

}