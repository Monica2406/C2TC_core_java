
import java.util.Scanner;

public class IfelseDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for voting");
            System.out.println("Bring your voter id");
        } else {
            System.out.println("Not eligible for voting");
            System.out.println("You need to wait for some more years");
        }
        System.out.println("Vote for India");
    }
}
