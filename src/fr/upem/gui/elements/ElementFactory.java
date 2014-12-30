package fr.upem.gui.elements;

import java.util.HashMap;

public class ElementFactory {

	private static final HashMap<String, Element> elements = new HashMap<String, Element>();
	
	public ElementFactory() {
		/* * CANON * */
		Element simple_canon = (a,b) -> {
			
		};
		Element double_canon = (a,b) -> {
			
		};
		Element blast_canon = (a,b) -> {
			
		};
		elements.put("Simple canon", simple_canon);
		elements.put("Double canon", double_canon);
		elements.put("Blast canon", blast_canon);
		
		/* * ELEMENT * */
		Element net = (a,b) -> {
			
		};
		Element wall = (a,b) -> {
			
		};
		elements.put("Net", net);
		elements.put("Wall", wall);
		
		/* * CAT * */
		Cat2D clawed = (a,b) -> {
			
		};
		Cat2D normal = (a,b) -> {
			
		};
		Cat2D gym = (a,b) -> {
			
		};
		elements.put("Clawed cat", clawed);		
		elements.put("Normal cat", normal);		
		elements.put("Gym cat", gym);
		
		/* * BOMB * */
		Bomb2D bomb = (a,b) -> {
			
		};
		Bomb2D vortex = (a,b) -> {
			
		};
		elements.put("Bomb", bomb);
		elements.put("Vortex", vortex);
	}
	
	public static Element getElement(String name) {
		return elements.get(name);
	}
}
