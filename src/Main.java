import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {

            Scanner s = new Scanner(System.in);
            System.out.println("Le a :");
            int a = s.nextInt();



            System.out.println("Le b :");
            int b = s.nextInt();

            int d = 0;

            d =  a / b;

            System.out.println("Le d=" + d);

        }



    }


}




abstract class Person {
    String name;

    public abstract int getID();


    public abstract String getPassword();

}

class Student extends Person {
    int apogee;
    String password;


    @Override
    public int getID() {
        return apogee;
    }

    @Override
    public String getPassword() {
        return password;
    }
}

class Prof extends Person {
    int ppr;
    String mdp;


    public int getID(){
        return ppr;
    }
    public String getPassword(){
        return mdp;
    }

}

class Auth{
    public  void login(Person person){
            int id = person.getID();
            String password = person.getPassword();

//        if (person.getClass().getName() == "Student"){
//            Student s = (Student) person;
//            int id = s.apogee;
//            String password = s.password;
//        }
//        if (person.getClass().getName() == "Prof"){
//            Prof s = (Prof) person;
//            int id = s.ppr;
//            String password = s.mdp;
//        }
//
//        code for auth

    }
}



abstract class TestB implements Account, Notification{

}

class Tetsta extends TestB{

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public void send() {

    }
}