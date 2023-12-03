import java.awt.*;

public class Circle extends Ellipse{

    public Circle(int diameter){
        super(diameter, diameter);
    }

    public Circle(int px, int py,Color c){
        super(px,py,c);
    }

    public void setAxeHorizontal (int diameter){
        super.setSemiAxysX(diameter);
        super.setSemiAxysY(diameter);
    }

    public void setAxeVertical (int diameter){
        super.setSemiAxysX(diameter);
        super.setSemiAxysY(diameter);
    }

    public void setBoundingBox(int lengthBB,int widhtBB){
        super.setSemiAxysX(lengthBB);
        super.setSemiAxysY(widhtBB);
    }

    public void draw(Graphics g) {
        g.setColor(c);
        g.fillOval(origine.getX(),origine.getY(),semiAxysX,semiAxysY);
    }

}
