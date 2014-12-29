package fr.upem.gui.elements;

import java.util.ArrayList;

public class Config {
	
	private final ArrayList<Cat2D> cats = new ArrayList<Cat2D>();
	private final ArrayList<Bomb2D> bombs = new ArrayList<Bomb2D>();

	public void draw() {
		/**
		 * draw cats in bottom left corner cell		
		 */
		for(Cat2D c : cats) {
			c.draw(null);
		}
		/**
		 * draw bombs in bottom right corner cell
		 */
		for(Bomb2D b : bombs) {
			b.draw(null);
		}
	}

}
