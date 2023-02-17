import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name> ");
        Scanner s = new Scanner(System.in);
        Hello.Hello(s.nextLine());
    }
}