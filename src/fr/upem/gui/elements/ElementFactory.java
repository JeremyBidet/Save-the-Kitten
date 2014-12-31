package fr.upem.gui.elements;

import java.util.HashMap;

public class ElementFactory {

	private final HashMap<String, Element> elements;
	
	private ElementFactory(HashMap<String, Element> elements) {
		this.elements = elements;
	}
	
	public static ElementFactory createElements() {
		HashMap<String, Element> elements = new HashMap<String, Element>();
		/**
		 * TODO: set the drawing functions
		 */
		/* * CANON * */
		Canon2D simple_canon = null;
		Canon2D double_canon = null;
		Canon2D blast_canon = null;
		elements.put("Simple", simple_canon);
		elements.put("Double", double_canon);
		elements.put("Blast", blast_canon);
		/* * ELEMENT * */
		Structure net = null;
		Structure wall = null;
		elements.put("Net", net);
		elements.put("Wall", wall);
		/* * CAT * */
		Cat2D clawed = null;
		Cat2D normal = null;
		Cat2D gym = null;
		elements.put("Clawed", clawed);		
		elements.put("Normal", normal);		
		elements.put("Gym", gym);
		/* * BOMB * */
		Bomb2D bomb = null;
		Bomb2D vortex = null;
		elements.put("Bomb", bomb);
		elements.put("Vortex", vortex);
		
		return new ElementFactory(elements);
	}
	
	public Structure getStructure(String name) throws IllegalArgumentException {
		Element e = elements.get(name);
		if(e instanceof Structure) {
			return (Structure)e;
		} else {
			throw new IllegalArgumentException("This name does not refer to a structure element");
		}
	}
	
	public Canon2D getCanon(String name) throws IllegalArgumentException {
		Element e = elements.get(name);
		if(e instanceof Canon2D) {
			return (Canon2D)e;
		} else {
			throw new IllegalArgumentException("This name does not refer to a canon element");
		}
	}
	
	public Cat2D getCat(String name) throws IllegalArgumentException {
		Element e = elements.get(name);
		if(e instanceof Cat2D) {
			return (Cat2D)e;
		} else {
			throw new IllegalArgumentException("This name does not refer to a cat element");
		}
	}
	
	public Bomb2D getBomb(String name) throws IllegalArgumentException {
		Element e = elements.get(name);
		if(e instanceof Bomb2D) {
			return (Bomb2D)e;
		} else {
			throw new IllegalArgumentException("This name does not refer to a bomb element");
		}
	}
	
}
