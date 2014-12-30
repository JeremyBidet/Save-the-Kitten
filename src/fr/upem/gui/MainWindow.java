package fr.upem.gui;

import fr.umlv.zen4.Application;
import fr.umlv.zen4.MotionEvent.Action;
import fr.upem.gui.windows.Game;
import fr.upem.gui.windows.Window;

public class MainWindow {

	/**
	 * Not final, cause settings could change
	 */
	private MainWindowSetting settings = new MainWindowSetting();
	/**
	 * Not final cause window change from menu to help to level and vice-versa
	 */
	private Window window;
	
	public void run() {
		/**
		 * TODO:
		 */
		Application.run(settings.BACKGROUND_COLOR, application_context -> {
			final Screen screen = new Screen(
					application_context.getScreenInfo().getWidth(),
					application_context.getScreenInfo().getHeight());
			/* ********************** DBG! log settings ********************* */
			/**/System.out.println("___Settings___\n" + settings.toString());
			/**/System.out.println("___Screen Info___\n"
			/**/		+ "Width : " + screen.getWidth() + "\n"
			/**/		+ "Height : " + screen.getHeight() + "\n");
			/* ************************************************************** */
			for(;;) {
				if(Action.UP == application_context.pollMotionTracker().getAction()) {
					application_context.exit(0);
				}
				application_context.renderFrame(window.getGraphicsConsumer());
			}
		});
	}
	
	
	public void menu(Window menu) {
		this.window = menu;
	}
	public void level(int no_level) throws Exception {
		if(null == (window = Game.loadLevel(no_level))) {
			throw new Exception("Level " + no_level + " not found !");
		}
	}
	
	
	public String settings() {
		return settings.toString();
	}
	
}
