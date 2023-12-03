import java.awt.*;
public class Rectangle extends Figure{
    protected int length;
    protected int width;

    public Rectangle(int length, int width)
    {
        super ();
        this.length=length;
        this.width=width;
    }

    public Rectangle(int px, int py,Color c){
        super(px,py,c);
    }

    public double getPerimetre()
    {
        return (this.length+this.width)*2;
    }
    public double getSurface()
    {
        return this.length*this.width;
    }
    public int getLength() {return length;}

    public int getWidth() {return width;}

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBoundingBox(int lengthBB,int widthBB){
        this.width=lengthBB;
        this.length=widthBB;
    }

    public void draw(Graphics g){
        g.setColor(c);
        g.fillRect(origine.getX(),origine.getY(),length,width);
    }

    public String toString ()
    {
        String s = "+";
        for (int i=0;i<length;i++) s=s+"--";
        s += "+\n";

        for (int j=0; j <width;j++)
        {
            s+="|";
            for (int i=0;i<length;i++) s=s+"  ";
            s+="|\n";
        }

        s+="+";
        for (int i=0;i<length;i++) s=s+"--";
        s += "+\n";
        return s;
    }
}

