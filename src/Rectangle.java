import java.awt.*;
public class Rectangle  extends Figure {
    public Rectangle(int px,int py,Color c){
        super(c,new Point(px,py));
    }



    @Override
    public void draw(Graphics g) {

    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + this.length + ", width=" + this.width + '}';
    }
}

