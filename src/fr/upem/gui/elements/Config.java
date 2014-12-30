package fr.upem.gui.elements;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class Config {
	
	private final ArrayList<Cat2D> cats = new ArrayList<Cat2D>();
	private final ArrayList<Bomb2D> bombs = new ArrayList<Bomb2D>();

	public void draw(Graphics2D graphics, boolean contentLost) {
		/**
		 * TODO: draw area of cats in bottom left corner cell		
		 */
		for(Cat2D c : cats) {
			c.accept(graphics, contentLost);
		}
		/**
		 * TODO: draw area of bombs in bottom right corner cell
		 */
		for(Bomb2D b : bombs) {
			b.accept(graphics, contentLost);
		}
	}

}
