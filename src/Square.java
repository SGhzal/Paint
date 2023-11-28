import java.awt.*;
public class Square extends Rectangle{

    private int lenght;
    private int width;
    public Square(int px, int py, Color c) {
        super(px, py, c);
    }

    public void setHeight(int lenght) {
        this.lenght = lenght;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setBoundingBox(int heightBB, int widthBB) {
        this.lenght = heightBB;
        this.width = widthBB;
    }

}