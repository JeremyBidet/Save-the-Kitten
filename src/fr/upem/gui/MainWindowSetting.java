package fr.upem.gui;

import java.awt.Color;

public class MainWindowSetting {
	
	public static class Position {
		public enum Vertical {
			TOP, BOTTOM, CENTER
		}
		public enum Horizontal {
			LEFT, RIGHT, CENTER
		}
		private Vertical VERTICAL;
		private Horizontal HORIZONTAL;
		private Position(Vertical vertical, Horizontal horizontal) {
			this.VERTICAL = vertical;
			this.HORIZONTAL = horizontal;
		}
		public static Position set(Vertical vertical, Horizontal horizontal) {
			return new Position(vertical, horizontal);
		}
		/**
		 * Set vertical and horizontal position to CENTER.
		 * @return
		 */
		public static Position auto() {
			return new Position(Vertical.CENTER, Horizontal.CENTER);
		}
	}

	public final int WIDTH  = 1024;
	public final int HEIGHT =  768;
	
	public final Position POSITION = Position.auto();
	
	public final Color BACKGROUND_COLOR = Color.black;
	
	@Override
	public String toString() {
		return "Width : " + WIDTH + "\n"
				+ "Height : " + HEIGHT + "\n"
				+ "Position : { vertical:" + POSITION.VERTICAL.name() + ", horizontal:" + POSITION.HORIZONTAL.name() + " }\n"
				+ "Color : " + BACKGROUND_COLOR.toString();
	}
	
}
