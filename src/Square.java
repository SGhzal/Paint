import java.awt.*;

public class Square extends Rectangle{

    public Square(int side)
    {
        super(side, side);
    }
    public Square(int px,int py,Color c){
        super(px, py, c);
    }
    public void setLength(int side){
        super.setLength(side);
        super.setWidth(side);
    }
    public void setWidth(int side){
        super.setLength(side);
        super.setWidth(side);
    }

    public void setBoundingBox(int lengthBB,int widhtBB){
        super.setLength(lengthBB);
        super.setWidth(widhtBB);
    }

    public void draw(Graphics g){
        g.setColor(c);
        g.fillRect(origine.getX(),origine.getY(),length,width);
    }
}