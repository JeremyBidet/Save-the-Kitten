package fr.upem.gui;

import java.awt.Color;
import java.util.Objects;

/**
 * Define settings for the main window with a width, a height, a position and a color.
 * @see Position
 * @see Color
 * @author Jeremy
 * @author Melody
 */
public class WindowSetting {
	
	/**
	 * Define position of the main window
	 * @author Jeremy
	 * @author Melody
	 */
	public static class Position {
		/**
		 * TOP, BOTTOM, CENTER
		 * @author Jeremy
		 * @author Melody
		 */
		public enum Vertical {
			TOP, BOTTOM, CENTER
		}
		/**
		 * LEFT, RIGHT, CENTER
		 * @author Jeremy
		 * @author Melody
		 */
		public enum Horizontal {
			LEFT, RIGHT, CENTER
		}
		public final Vertical vertical;
		public final Horizontal horizontal;
		
		private Position(Vertical vertical, Horizontal horizontal) {
			this.vertical = vertical;
			this.horizontal = horizontal;
		}
		/**
		 * Set position to vertical and horizontal
		 * @param vertical can be top, bottom or center
		 * @param horizontal can be left, right or center
		 * @return position
		 * @see Vertical
		 * @see Horizontal
		 */
		public static Position set(Vertical vertical, Horizontal horizontal) {
			return new Position(Objects.requireNonNull(vertical), Objects.requireNonNull(horizontal));
		}
		/**
		 * Set vertical and horizontal position to center.
		 * @return centered position
		 */
		public static Position auto() {
			return new Position(Vertical.CENTER, Horizontal.CENTER);
		}
	}

	public final int width;
	public final int height;
	public final Position position;
	public final Color background_color;
	
	public WindowSetting() {
		this.width            = 1024;
		this.height           =  768;
		this.position         = Position.auto();
		this.background_color = Color.black;
	}
	
	public WindowSetting(int width, int height, Position position, Color background_color) {
		if(width <= 0) {
			throw new IllegalArgumentException("Width cannot be negative or null !");
		}
		this.width = width;
		if(height <= 0) {
			throw new IllegalArgumentException("Height cannot be negative or null !");
		}
		this.height           = height;
		this.position         = Objects.requireNonNull(position);
		this.background_color = Objects.requireNonNull(background_color);
	}
	
	@Override
	public String toString() {
		return "Width : " + width + "\n"
				+ "Height : " + height + "\n"
				+ "Position : { vertical:" + position.vertical.name() + ", horizontal:" + position.horizontal.name() + " }\n"
				+ "Color : " + background_color.toString();
	}
	
}
