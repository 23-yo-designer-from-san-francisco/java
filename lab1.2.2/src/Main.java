import java.util.*;

// 2. Наибольшее и наименьшее число.
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter n> ");
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        Integer[] nums = new Integer[n];

        for (int i = 0; i < n; ++i) {
            System.out.printf("Enter number %d>", i);
            nums[i] = Integer.parseInt(s.next());
        }

        List<Integer> numbers = Arrays.asList(nums);

        System.out.printf("Greatest: %s\n", String.join(", ", Collections.max(numbers).toString()));
        System.out.printf("Smallest: %s\n", String.join(", ", Collections.min(numbers).toString()));
    }
}