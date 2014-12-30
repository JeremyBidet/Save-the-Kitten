package fr.upem.gui.windows;

import java.util.HashMap;

public class Game {

	private static final HashMap<Integer, Level> levels = new HashMap<Integer, Level>(3);
	
	public static void addLevel(int no_level, Level level) {
		levels.put(no_level, level);
	}
	
	public static Level loadLevel(int no_level) {
		return levels.get(no_level);
	}

}
