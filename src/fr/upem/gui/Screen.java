package fr.upem.gui;

public class Screen {

	private final int width;
	private final int height;
	
	public Screen(float width, float height) {
		this.width = (int)width;
		this.height = (int)height;
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
}
