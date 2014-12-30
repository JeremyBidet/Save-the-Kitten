package fr.upem.gui.windows;


import fr.upem.gui.elements.Area;
import fr.upem.gui.elements.Config;

public class Level implements Window {

	private final Area area;
	private final Config config;
	
	public Level(Area area, Config config) {
		this.area = area;
		this.config = config;
	}

	public void draw() {
		area.draw();
		config.draw();
	}
}
