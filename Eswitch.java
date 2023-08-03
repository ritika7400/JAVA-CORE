import java.util.Scanner;

public class Eswitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
           case "apple" -> System.out.println("red fruit");
           case "mango" -> System.out.println("kinf of the fruits");
           default -> System.out.println("invalid name");
        }
    }
}
