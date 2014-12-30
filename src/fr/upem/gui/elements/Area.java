package fr.upem.gui.elements;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class Area {

	private final Canon2D canon;
	private final ArrayList<Structure> structures = new ArrayList<Structure>();

	public Area(Canon2D canon) {
		this.canon = canon;
	}
	
	public void draw(Graphics2D graphics, boolean contentLost) {
		canon.accept(graphics, contentLost);
		for(Structure s : structures) {
			s.accept(graphics, contentLost);
		}
	}
	
	public void add(Structure structure) {
		structures.add(structure);
	}

}
