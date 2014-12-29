package fr.upem.main;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import fr.umlv.zen4.Application;

public class KeyboardMain {
  public static void main(String[] args) {
    int WIDTH = 800;
    int HEIGHT = 600;

    Application.run(Color.black, context -> {
      Random random = new Random(0);
      Font font = new Font("arial", Font.BOLD, 30);
      for(;;) {
        context.renderFrame((graphics,b) -> {
          float x = random.nextInt(WIDTH);
          float y = random.nextInt(HEIGHT);

          Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
          graphics.setPaint(color);
          graphics.setFont(font);
          graphics.drawString("no event", x, y);
        });
      }
    });
  }
}
