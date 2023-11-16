import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(test());

    }

    static String test(){

            try {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Le a:");
                String s = scanner.nextLine();
                int a = Integer.parseInt(s);
                int b = 1 / a;
                System.out.println(a);
                return  "test";
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException");
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
            } catch (Exception e) {
                System.out.println("Global exception");
            } finally {
                System.out.println("This is finally");

            }
        return  "Okay";

    }

}


class A {
    String name;
}
