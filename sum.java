import java.util.Scanner;

public class sum {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two number:");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int s = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + s);

    }

}
