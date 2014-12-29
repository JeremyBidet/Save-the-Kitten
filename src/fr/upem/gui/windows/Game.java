package fr.upem.gui.windows;

import java.util.HashMap;

public class Game {

	private static final HashMap<Integer, Level> levels = new HashMap<Integer, Level>();
	
	public static void add(int no_level, Level level) {
		levels.put(no_level, level);
	}
	
	public static Level init(int no_level) {
		return levels.get(no_level);
	}

}
