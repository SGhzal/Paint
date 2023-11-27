import java.awt.*;

public abstract class Figure {
    protected Color color;
    protected Point origin;
    protected int length;
    protected int width;

    public Figure(Color color, Point origin) {
        this.color = color;
        this.origin = origin;
    }

    public Color getColor() {
        return color;
    }

    public Point getOrigin() {
        return origin;
    }

    public int getLeight() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setBoundingBox(int heightBB, int widthBB) {
        this.length = heightBB;
        this.width = widthBB;
    }
    public int getperimetre(){
        return 2*(length+width);
    }
    //getsurface
    public int getsurface(){
        return length*width;
    }
    public abstract void draw(Graphics g);
    @Override
    public String toString() {
        return "Figure{" +
                "color=" + color +
                ", origin=" + origin +
                ", height=" + length +
                ", width=" + width +
                '}';
    }
}