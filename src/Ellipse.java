import java.lang.Math;
import java.awt.*;

public class Ellipse extends Figure{
    protected int semiAxysX;
    protected int semiAxysY;


    public Ellipse(int x,int y){
        super();// appel de constructeur de la  classe mere
        this.semiAxysX=x;this.semiAxysY=y;}
    public Ellipse(int px,int py,Color c){
        super(px,py,c);
    }
    public double getPerimetre(){
        return (int) (2*Math.PI*Math.sqrt(((semiAxysX*semiAxysX) +(semiAxysY*semiAxysY))/2)); //?P≈π(3(a+b)−√(3a+b)(a+3b)).
    }
    public double getSurface(){
        return (int) (Math.PI*semiAxysX*semiAxysY);
    } //S = π×r2 π × r 2

    public void setSemiAxysX(int semiAxysX) {this.semiAxysX = semiAxysX;}

    public void setSemiAxysY(int semiAxysY) {this.semiAxysY = semiAxysY;}

    public void setBoundingBox(int lengthBB, int widthBB){
        this.semiAxysX=widthBB;
        this.semiAxysY=lengthBB;
    }
    public void draw(Graphics g) {
        g.setColor(c);
        g.fillOval(origine.getX(),origine.getY(),semiAxysY,semiAxysX);
    }
}