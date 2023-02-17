import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter n> ");
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String[] strings = new String[n];

        for (int i = 0; i < n; ++i) {
            System.out.printf(String.format("Enter string %d> ", i));
            String str = s.nextLine();
            strings[i] = str;
        }

        System.out.print("asc or desc?> ");
        boolean desc = s.next().equals("desc");
        Comparator comparator = desc ?  Comparator.comparingInt(String::length).reversed() : Comparator.comparingInt(String::length);
        Arrays.sort(strings, comparator);

        System.out.printf("Result: %s", String.join(", ", strings));
    }
}