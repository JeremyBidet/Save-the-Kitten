package fr.upem.main;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import fr.umlv.zen4.Application;
import fr.umlv.zen4.MotionEvent;

public class KeyboardMain {
	public static void main(String[] args) {
		
		Application.run(Color.black, context -> {
			int width  = (int)context.getScreenInfo().getWidth();
			int height = (int)context.getScreenInfo().getHeight();
			Random random = new Random(0);
			Font font = new Font("arial", Font.BOLD, 30);
			for (;;) {
				context.renderFrame((graphics, b) -> {
					float x = random.nextInt(width);
					float y = random.nextInt(height);

					Color color = new Color(random.nextInt(255), random
							.nextInt(255), random.nextInt(255));
					graphics.setPaint(color);
					graphics.setFont(font);
					graphics.drawRect(width-width*10/100, height-height*10/100, width*10/100, height*10/100);
					try {
						MotionEvent me = context.waitAndBlockUntilAMotion();
						graphics.drawString(me.getAction().name(), x, y);
						if(me.getX() >= (width-width*10/100)
						&& me.getY() >= (height-height*10/100) ) {
							context.exit(0);
						}
					} catch (Exception e) {
						graphics.drawString("no event", x, y);
						e.printStackTrace();
					}

				});
			}
		});
	}
}
