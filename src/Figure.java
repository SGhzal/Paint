import java.awt.*;
public abstract class Figure {
    // point et color et graphic appartenant à java.awt .*
    protected Point origine;
    protected Color c;

    // initialisation de l'origine(0,0) avec la couleur :
    public Figure(){
        this.origine = new Point(0,0);
    }
    public Figure(int px, int py, Color col) {
        this.origine = new Point(px, py);
        this.c = col;
    }
    // voir rectangle
    public abstract double getPerimetre();
    public abstract double getSurface();
    public abstract void setBoundingBox(int lengthBB, int widthBB);
    public abstract void draw(Graphics g);

    // affichage
    @Override
    public String toString() {
        return "La figure commence de là :(" + this.origine.getX() + ", " + this.origine.getY() + ")";
    }
}
