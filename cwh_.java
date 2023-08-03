import java.util.Scanner;

public class cwh_ {
    public static void main(String[] args) {
    //    input from user 
    int a,b;
    try (Scanner kb = new Scanner(System.in)) {
        System.out.println("enter the value of a ");
        a = kb.nextInt();
        System.out.println("enter the value of b ");
        b = kb.nextInt();
    }
    System.out.println("the sum of a and b is:" + (a+b));

        

    }
}
