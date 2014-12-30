package fr.upem.gui.elements;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class Area {

	private final ArrayList<Element> elements = new ArrayList<Element>();

	public void draw(Graphics2D graphics, boolean contentLost) {
		for(Element e : elements) {
			e.accept(graphics, contentLost);
		}
	}

}
