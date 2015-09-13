import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Sum two numbers, type first number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Type second number:");
        int num2 = sc.nextInt();
        System.out.println (num + num2);
    }
}
