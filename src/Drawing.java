import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.event.*;


public class Drawing extends JPanel implements MouseMotionListener, MouseListener{
    private ArrayList<Figure> liste;
    private Color c;
    private String nomFigure;
    private int x;
    private int y;


    public Drawing(){
        super();
        c= Color.black;
        nomFigure="Rectangle";
        liste=new ArrayList<Figure>();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.white);
        for(Figure f:liste){
            f.draw(g);
            this.repaint();
        }
    }
    public void saveDrawing(String nameFile)
    {
        try{
            FileOutputStream fos = new FileOutputStream(nameFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(liste.size());

            for (Figure f : liste)
            {
                oos.writeObject(f);
            }
            oos.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void recallDrawing(String nameFile)
    {
        try{
            FileInputStream fis = new FileInputStream(nameFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            reset();

            int numberOfFigure=ois.readInt();
            for (int i=0; i<numberOfFigure; i++)
            {Figure f=(Figure) ois.readObject();
                liste.add(f);
            }

            ois.close();
            paintComponent(this.getGraphics());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void reset()
    {
        this.liste.clear();
        paintComponent(this.getGraphics());
    }


    public void setColor(Color color){
        this.c=color;
    }

    public void setnomFigure(String nomfigure){
        this.nomFigure=nomfigure;
    }

    public ArrayList<Figure> getListe(){
        return this.liste;
    }


    public void mouseClicked(MouseEvent e){
    }

    public void mouseMoved(MouseEvent e){
    }

    public void mouseDragged(MouseEvent e){
        liste.get(liste.size()-1).setBoundingBox(e.getX()-x,e.getY()-y);
        paintComponent(this.getGraphics());

    }

    public void mouseEntered(MouseEvent e){
    }

    public void mouseExited(MouseEvent e){
    }

    public void mousePressed(MouseEvent e){
        this.x=e.getX();
        this.y=e.getY();

        switch (nomFigure){
            case "Carre" : liste.add(new Square(x,y,c));
                break;
            case "Rectangle" : liste.add(new Rectangle(x,y,c));
                break;
            case "Cercle" : liste.add(new Circle(x,y,c));
                break;
            case "Ellipse" : liste.add(new Ellipse(x,y,c));
                break;
        }
    }

    public void mouseReleased(MouseEvent e){
        liste.get(liste.size()-1).setBoundingBox(e.getX()-x,e.getY()-y);
        paintComponent(this.getGraphics());
    }
}
