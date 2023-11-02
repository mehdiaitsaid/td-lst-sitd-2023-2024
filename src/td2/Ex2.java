package td2;

public class Ex2 {
    public static void main(String[] args) {
        Point a = new Point();
        a.setNom('A');
        a.setX(5);
        a.setY(6);
        System.out.println(a);

    }
}


class Point{
    private double x,y;
    private char nom;

    Point(){}
    Point(double x, double y, char nom){
        this.x = x;
        this.y = y;
        this.nom = nom;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public char getNom() {
        return nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public double norme(){
        return  Math.sqrt(x*x + Math.pow(this.getY(),2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", nom=" + nom +
                ", norme=" + this.norme() +
                '}';
    }
}
