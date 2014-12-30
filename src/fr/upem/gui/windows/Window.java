package fr.upem.gui.windows;

import fr.umlv.zen4.GraphicsConsumer;

public abstract class Window {

	private GraphicsConsumer gc;
	
	protected Window(GraphicsConsumer gc) {
		this.gc = gc;
	}
	
	public GraphicsConsumer getGraphicsConsumer() {
		return gc;
	}
}
