package fr.upem.gui;

import fr.umlv.zen4.Application;
import fr.umlv.zen4.MotionEvent.Action;
import fr.upem.gui.elements.Area;
import fr.upem.gui.elements.Config;
import fr.upem.gui.elements.ElementFactory;
import fr.upem.gui.windows.Game;
import fr.upem.gui.windows.Help;
import fr.upem.gui.windows.Home;
import fr.upem.gui.windows.Level;
import fr.upem.gui.windows.Window;

/**
 * Set the main GUI for the game.<br>
 * {@link MainWindowSettings} define settings.<br>
 * @author Jeremy
 * @author Melody
 */
public class MainWindow {
	
	private final WindowSetting settings;
	
	public MainWindow(WindowSetting settings) {
		this.settings = settings;
	}
	
	public void run() {
		final Window home = new Home();
		final Window help = new Help();
		final ElementFactory elements = ElementFactory.createElements();
		new Game();
		Game.addLevel(1, new Level(new Area(elements.getCanon("Simple")), new Config()));
		Game.addLevel(2, new Level(new Area(elements.getCanon("Blast")), new Config()));
		Game.addLevel(3, new Level(new Area(elements.getCanon("Double")), new Config()));
		
		Application.run(settings.background_color, application_context -> {
			final Screen screen = new Screen(
					application_context.getScreenInfo().getWidth(),
					application_context.getScreenInfo().getHeight());
			/* ********************** DBG! log settings ********************* */
//			System.out.println("___Settings___\n" + settings.toString());
//			System.out.println("___Screen Info___\n"
//					+ "Width : " + screen.getWidth() + "\n"
//					+ "Height : " + screen.getHeight() + "\n");
			/* ************************************************************** */
			Window window = home;
			for(;;) {
				if(Action.UP == application_context.pollMotionTracker().getAction()) {
					application_context.exit(0);
				}
				application_context.renderFrame(window.getGraphicsConsumer());
			}
		});
	}
	
	/*
	public void menu(Window menu) {
		this.window = menu;
	}
	public void level(int no_level) throws Exception {
		if(null == (window = Game.loadLevel(no_level))) {
			throw new Exception("Level " + no_level + " not found !");
		}
	}*/
	
	public String settings() {
		return settings.toString();
	}
	
}
