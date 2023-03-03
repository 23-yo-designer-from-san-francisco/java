import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

// 1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
public class Main {
    public static void Print(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter n> ");
        Random rand = new Random();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; ++i) {
            Arrays.setAll(matrix[i], e -> rand.nextInt(-n, n+1));
        }
        Print(matrix);

        System.out.print("Enter k> ");
        int k = s.nextInt();

        System.out.print("Lines or columns?> ");
        String mode = s.next();
        if (mode.equalsIgnoreCase("lines")) {
            Arrays.sort(matrix[k]);
        } else if (mode.equalsIgnoreCase("columns")) {
            Arrays.sort(matrix,Comparator.comparingInt(a -> a[k]));
        } else {
            System.out.println("ERROR!!!!!");
        }

        Print(matrix);
    }
}
