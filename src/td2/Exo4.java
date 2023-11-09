package td2;

public class Exo4 {

    public static void main(String[] args) {
        Temps t = new Temps(20,23,1);
        System.out.println(t.toString());
        t.ajouterM(300);
        System.out.println(t.toString());
        t.ajouterS(3600);
        System.out.println(t.toString());

    }

}


class Temps{
    private int s,m,h;

    public Temps() {
    }

    public Temps(int h) {
        this();
        this.h = h;
    }

    public Temps(int m, int h) {
        this(h);
        this.m = m;

    }

    public Temps(int s, int m, int h) {
        this(m,h);
        this.s = s;

    }
    public Temps(Temps temps) {
        this(temps.getS(), temps.getM(), temps.getH());
    }

    public void ajouterH(int h){
        this.setH(this.getH() + h);
    }

    public void ajouterM(int m){
        m += this.getM();
        ajouterH(m/60);
        this.setM(m % 60);
    }
    public void ajouterS(int s){
        s += this.getS();
        ajouterM(s/60);
        this.setS(s % 60);
    }


    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Temps{" +
                "s=" + s +
                ", m=" + m +
                ", h=" + h +
                '}';
    }
}