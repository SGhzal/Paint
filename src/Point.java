public class Point {
    private int x;// Coordonnée x du point.
    private int y; // Coordonnée y du point.
    // Les constructeur
    public Point() {
        this.x = 0;//private
        this.y = 0;//private
    }
    public Point(int x, int y) {
        this.x = x;//private
        this.y = y;//private
    }
    // getters

    public int gety() {
        return y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public String tostring(){
        return "Point{"+"X"+x+",Y="+y+"}";
    }
    }

