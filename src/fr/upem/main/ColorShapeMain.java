package fr.upem.main;

import java.awt.Color;
import java.awt.RadialGradientPaint;
import java.awt.geom.Ellipse2D;
import java.util.Random;

import fr.umlv.zen4.Application;

public class ColorShapeMain {
  public static void main(String[] args) {
    int WIDTH = 800;
    int HEIGHT = 600;
    int SIZE = 30;
    int STRIDE = 100;

    Application.run(Color.gray, context -> {
      Random random = new Random(0);
      for(;;) {
        try {
          Thread.sleep(1);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        context.renderFrame( (a,b) -> {
          for(int i = 0; i < STRIDE; i++) {
            float x = random.nextInt(WIDTH);
            float y = random.nextInt(HEIGHT);

            Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255), random.nextInt(255));
            RadialGradientPaint paint = new RadialGradientPaint(x, y, SIZE, new float[]{0f, 1f}, new Color[]{color, Color.WHITE});
            a.setPaint(paint);
            a.fill(new Ellipse2D.Float(x - SIZE/2, y - SIZE/2, SIZE, SIZE));
          }
        });
      }
    });
  }
}
