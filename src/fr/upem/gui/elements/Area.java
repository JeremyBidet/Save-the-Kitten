package fr.upem.gui.elements;

import java.util.ArrayList;

public class Area {

	private final ArrayList<Element> elements = new ArrayList<Element>();
	
	public void draw() {
		for(Element e : elements) {
			e.draw();
		}
	}

}
