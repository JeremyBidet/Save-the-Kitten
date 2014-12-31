package fr.upem.gui.windows;

import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import java.util.Objects;



public class WindowFactory {

	private final HashMap<String, WindowConsumer> windows;
	
	private WindowFactory(HashMap<String, WindowConsumer> windows) {
		this.windows = windows;
	}
	
	public static WindowFactory createWindows() {
		final HashMap<String, WindowConsumer> windows = new HashMap<String, WindowConsumer>(3);
		
		windows.put("Home", (context, settings) -> {
			/**
			 * TODO:
			 * according to the click,
			 * return a link to the Help window
			 * or to the Level window.
			 */
			context.renderFrame((graphics, content) -> {
				
			});
			return windows.get("Home");
		});
		windows.put("Help", (context, settings) -> {
			/**
			 * TODO:
			 * according to the click,
			 * return a link to the Home window
			 * or to the Help window itself.
			 */
			context.renderFrame((graphics, content) -> {
				
			});
			return windows.get("Help");
		});
		windows.put("Level", (context, settings) -> {
			final LevelFactory levels = LevelFactory.createLevels();
			/**
			 * TODO: according to the click,
			 * return a link to the Home window
			 * or to a level window <code>levels.get(no_level)</code>
			 * or to the Level window itself.
			 */
			context.renderFrame((graphics, content) -> {
				graphics.setFont(new Font("Courrier new", Font.PLAIN, 12));
				graphics.setColor(Color.black);
				/*
				i : n° level
				x : offset from window left edge
				y : offset from window top edge
				
				i= 0, x=0, y=0 :  10,  10, 100, 100
				i= 1, x=1, y=0 : 110,  10, 100, 100
				i= 2, x=2, y=0 : 210,  10, 100, 100
				i= 3, x=3, y=0 : 310,  10, 100, 100
				i= 4, x=4, y=0 : 410,  10, 100, 100
				
				i= 5, x=0, y=1 :  10, 110, 100, 100
				i= 6, x=1, y=1 : 110, 110, 100, 100
				i= 7, x=2, y=1 : 210, 110, 100, 100
				i= 8, x=3, y=1 : 310, 110, 100, 100
				i= 9, x=2, y=1 : 210, 110, 100, 100
				
				i=10, x=0, y=2 :  10, 210, 100, 100
				i=11, x=1, y=2 : 110, 210, 100, 100
				i=12, x=2, y=2 : 210, 210, 100, 100
				i=13, x=3, y=2 : 310, 210, 100, 100
				i=14, x=2, y=2 : 210, 210, 100, 100
				 __________________________
				|  __   __   __   __   __  |
				| |__| |__| |__| |__| |__| |
				|  __   __   __   __   __  |
				| |__| |__| |__| |__| |__| |
				|  __   __   __   __   __  |
				| |__| |__| |__| |__| |__| |
				|__________________________|
				
				margin top and left : 10 percent of window width (= window_width * 10 /100)
				level width : window width - margin*6 / level_per_row (= (window_width - 6 * margin) / level_per_row)
				level height : level width (flat square aspect)
				*/
				int level_per_row = 5;
				int margin = settings.width * 10 / 100;
				int width = (settings.width - 6 * margin) / level_per_row;
				int height = width;
				for(int i=0, x=0, y=0;
						i<levels.level();
						i++, x=(x+1)%level_per_row, y=(i%level_per_row==0?y+1:y)) {
					graphics.drawRect(margin+x*width, margin+(y-1)*height, width, height);
				}
			});
			return windows.get("Level");
		});
		
		return new WindowFactory(windows);
	}
	
	public void addWindow(String name, WindowConsumer window) {
		windows.put(Objects.requireNonNull(name), Objects.requireNonNull(window));
	}
	
	public WindowConsumer getWindow(String name) {
		if(windows.containsKey(name)) {
			return windows.get(name);
		} else {
			throw new IllegalArgumentException("This window ("+ name +") does not exist !");
		}
	}
}
