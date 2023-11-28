import java.awt.*;
public class Circle extends Ellipse{
    public Circle(int px, int py, Color c) {
        super(c, new Point(px, py));
    }

    @Override
    public void draw(Graphics g) {
        // Leave empty for now
    }
}