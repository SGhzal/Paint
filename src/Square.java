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
        super.setLength(side);
    }
    public void setWidth(int side){
        super.setLength(side);
        super.setLength(side);
    }

    public void setBoundingBox(int lengthBB,int lenghtBB){
        super.setLength(lengthBB);
        super.setLength(lenghtBB);
    }

    public void draw(Graphics g){
        g.setColor(c);
        g.fillRect(origine.getX(),origine.getY(),length,length);
    }
}