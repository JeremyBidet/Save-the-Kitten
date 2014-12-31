package fr.upem.gui.windows;

import fr.umlv.zen4.ApplicationContext;
import fr.upem.gui.WindowSetting;

@FunctionalInterface
public interface WindowConsumer {
	public WindowConsumer accept(ApplicationContext context, WindowSetting settings);
}
