import java.util.Scanner;

//1. Создать класс Hello, который будет приветствовать любого пользователя, используя командную строку.
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your name> ");
        Scanner s = new Scanner(System.in);
        Hello.Hello(s.nextLine());
    }
}