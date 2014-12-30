package fr.upem.gui.windows;


import fr.upem.gui.elements.Area;
import fr.upem.gui.elements.Config;

public class Level extends Window {

	private final Area area;
	private final Config config;
	
	public Level(Area area, Config config) {
		super((graphics, contentLost) -> {
			/**
			 * draw area of area then call area code
			 */
			area.draw(graphics);
			/**
			 * draw area of config then call config code
			 */
			config.draw(graphics);
		});
		this.area = area;
		this.config = config;
	}
	
	public Area getArea() {
		return area;
	}
	
	public Config getConfig() {
		return config;
	}
	
}
