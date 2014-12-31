package fr.upem.gui.windows;

import java.util.HashMap;
import java.util.Objects;

import fr.upem.gui.elements.ElementFactory;

public class LevelFactory {

	private final HashMap<Integer, LevelConsumer> levels;
	
	private LevelFactory(HashMap<Integer, LevelConsumer> levels) {
		this.levels = levels;
	}
	
	public static LevelFactory createLevels() {
		final ElementFactory elements = ElementFactory.createElements();
		HashMap<Integer, LevelConsumer> levels = new HashMap<Integer, LevelConsumer>();
		
		levels.put(Integer.valueOf(levels.size()+1), (context, settings) -> {
			/**
			 * TODO:
			 * according to the click, return a link to the level itself
			 * or to the Level window
			 */
			context.renderFrame((graphics, content) -> {
				graphics.drawImage(elements.getCanon("Simple"), 10, 10, 10, 10, null);
			});
			return levels.get(1);
		});
		
		levels.put(Integer.valueOf(levels.size()+1), (context, settings) -> {
			/**
			 * TODO:
			 * according to the click, return a link to the level itself
			 * or to the Level window
			 */
			return levels.get(2);
		});
		
		levels.put(Integer.valueOf(levels.size()+1), (context, settings) -> {
			/**
			 * TODO:
			 * according to the click, return a link to the level itself
			 * or to the Level window
			 */
			return levels.get(3);
		});
		
		return new LevelFactory(levels);
	}
	
	public void addLevel(int no_level, LevelConsumer level) {
		levels.put(Objects.requireNonNull(Integer.valueOf(no_level)), Objects.requireNonNull(level));
	}
	
	public LevelConsumer getLevel(int no_level) {
		if(levels.containsKey(Integer.valueOf(no_level))) {
			return levels.get(Integer.valueOf(no_level));
		} else {
			throw new IllegalArgumentException("This level (" + no_level + ") does not exist !");
		}
	}
	
	public int level() {
		return levels.size();
	}
}
