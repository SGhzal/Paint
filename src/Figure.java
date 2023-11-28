import java.awt.*;

public abstract class Figure {
    protected Color color;
    protected Point origin;
    protected int length;
    protected int width;
    public int surface;
    public int perimetre;


    public Figure(Color c, Point point) {
        this.color=c;
        this.origin=point;
        }

    public void setBoundingBox(int heightBB, int widthBB) {
        this.length = heightBB;
        this.width = widthBB;
    }
    public int getperimetre(){
        perimetre=2*(length*width);
        return perimetre;
    }
    //getsurface

    public int getsurface(){
        surface=length*width;
        return surface;
    }
    //public abstract void draw(Graphics g);
    @Override
    public String toString() {
        return "Figure{" +
                "color=" + color +
                ", height=" + length +
                ", width=" + width +
                '}';
    }

    public abstract void draw(Graphics g);
}