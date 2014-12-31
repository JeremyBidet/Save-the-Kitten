package fr.upem.gui.windows;

import fr.umlv.zen4.ApplicationContext;
import fr.upem.gui.WindowSetting;


public class Window {
	
	private final ApplicationContext context;
	private final WindowSetting settings;
	
	public Window(ApplicationContext context, WindowSetting settings) {
		this.context = context;
		this.settings = settings;
	}
	
	public WindowConsumer apply(WindowConsumer consumer) {
		return consumer.accept(context, settings);
	}
	
}
