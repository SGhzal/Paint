public class Point {
    private int px;// Coordonnée x du point.
    private int py; // Coordonnée y du point.
    // Les constructeur
    public Point() {
        this.px = 0;//private
        this.py = 0;//private
    }
    public Point(int x, int y) {
        this.px = x;//private
        this.py = y;//private
    }
    // getters

    public int getPyy() {
        return py;
    }

    // Setters
    public void setPx(int x) {
        this.px = x;
    }
    public void setPy(int y) {
        this.py = y;
    }
    //public abstract void draw(Graphics g);
    public String tostring(){
        return "Point{"+"X"+px+",Y="+py+"}";
    }
    }

