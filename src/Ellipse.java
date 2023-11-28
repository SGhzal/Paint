import java.awt.*;
public class Ellipse extends Figure{
    int semiAxysX;
    int semiAxysY;
    int lenght;
    int width;
    protected Color color;
    protected Point origin;

    public Ellipse(Color c, Point point) {
        super(c,new Point());
    }


    public int getSemiAxysX() {
        return semiAxysX;
    }

    public int getSemiAxysY() {
        return semiAxysY;
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.lenght = heightBB;
        this.width = widthBB;
    }

    @Override
    public void draw(Graphics g) {
        // viiide
    }

}