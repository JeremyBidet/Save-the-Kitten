package fr.upem.gui;

import fr.umlv.zen4.Application;
import fr.upem.gui.windows.Window;
import fr.upem.gui.windows.WindowConsumer;
import fr.upem.gui.windows.WindowFactory;


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
		Application.run(settings.background_color, context -> {
			
			/* ********************** DBG! log settings ********************* */
			final Screen screen = new Screen(
					context.getScreenInfo().getWidth(),
					context.getScreenInfo().getHeight());
			System.out.println("___Settings___\n" + settings.toString());
			System.out.println("___Screen Info___\n"
					+ "Width : " + screen.getWidth() + "\n"
					+ "Height : " + screen.getHeight() + "\n");
			/* ************************************************************** */
			
			final WindowFactory consumers = WindowFactory.createWindows();
			Window window = new Window(context, settings);
			WindowConsumer consumer = consumers.getWindow("Home");
			for(;;) {
				consumer = window.apply(consumer);
			}
			
		});
	}
	
	public String settings() {
		return settings.toString();
	}
	
}
