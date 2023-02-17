import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter n> ");
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String[] strings = new String[n];
        int shortest = 0;
        int longest = 0;

        for (int i = 0; i < n; ++i) {
            System.out.printf(String.format("Enter string %d> ", i));
            String str = s.nextLine();
            strings[i] = str;
            if (str.length() > strings[longest].length()) {
                longest = i;
            }
            if (str.length() < strings[shortest].length()) {
                shortest = i;
            }
        }

        System.out.printf("Shortest: %s, length: %d%n", strings[shortest], strings[shortest].length());
        System.out.printf("Longest: %s, length: %d%n", strings[longest], strings[longest].length());
    }
}