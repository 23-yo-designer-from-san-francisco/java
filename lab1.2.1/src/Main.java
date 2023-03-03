import java.util.Arrays;
import java.util.Scanner;

//1. Четные и нечетные числа.
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter n> ");
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        int[] nums = new int[n];

        for (int i = 0; i < n; ++i) {
            System.out.printf("Enter number %d>", i);
            nums[i] = Integer.parseInt(s.next());
        }

        String[] even = Arrays.stream(nums).filter(num -> num % 2 == 0).mapToObj(String::valueOf).toArray(String[]::new);
        String[] odd = Arrays.stream(nums).filter(num -> num % 2 != 0).mapToObj(String::valueOf).toArray(String[]::new);

        System.out.printf("Even: %s\n", String.join(", ", even));
        System.out.printf("Odd: %s\n", String.join(", ", odd));
    }
}