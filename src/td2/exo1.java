package td2;

public class exo1 {
    public static void main(String[] args){
        point a=new point();
        a.setNom('a');
        a.setX(2);
        a.setY(2);
        a.translation();
        System.out.println(a);

    }
}
    class point{
        private char nom;
        private   double x;
        private double y;
        public point(){

        }
        public point(char nom,double x, double y){this.nom=nom;
            this.x=x;
            this.y=y;

        }
        public char getNom(){
            return nom;
        }
        public void  setNom(char nom){
            this.nom=nom;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }
        public double translation(){

            return Math.sqrt((x*x)+(y*y));
        }

        @Override
        public String toString() {
            return "point{" +
                    "nom=" + nom +
                    ", x=" + x +
                    ", y=" + y +"norme ="+this.translation()+
                    '}';
        }
    }


