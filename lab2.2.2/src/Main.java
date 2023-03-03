import java.lang.reflect.Array;
import java.util.*;

// 2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).
public class Main {

    static void shiftLeft(int k, Integer[][] mat) {
        for (int i = 0; i < mat.length; ++i) {
            List<Integer> list = Arrays.asList(mat[i]);
            Collections.rotate(list, -k);
            System.out.println((list));
        }
    }

    static void shiftRight(int k, Integer[][] mat) {
        for (int i = 0; i < mat.length; ++i) {
            List<Integer> list = Arrays.asList(mat[i]);
            Collections.rotate(list, k);
            System.out.println((list));
        }
    }
    static void shiftDown (int k, Integer[][] mat) {
        List<Integer[]> arrs = Arrays.asList(mat);
        Collections.rotate(arrs, k);
        for (int i = 0; i < arrs.size(); i++) {
            Integer[] arr = arrs.get(i);
            for (int j = 0; j < arr.length; j++) {
                System.out.printf(" %d ", arr[j]);
            }
            System.out.println();
        }
    }
    static void shiftUp (int k, Integer[][] mat) {
        List<Integer[]> arrs = Arrays.asList(mat);
        Collections.rotate(arrs, -k);
        for (int i = 0; i < arrs.size(); i++) {
            Integer[] arr = arrs.get(i);
            for (int j = 0; j < arr.length; j++) {
                System.out.printf(" %d ", arr[j]);
            }
            System.out.println();
        }
    }
    public static void Print(Integer[][] matrix) {
        for (Integer[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter n> ");
        Random rand = new Random();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Integer[][] matrix = new Integer[n][n];

        for (int i = 0; i < n; ++i) {
            Arrays.setAll(matrix[i], e -> rand.nextInt(-n, n+1));
        }
        Print(matrix);

        System.out.println("Enter k> ");
        int k = s.nextInt();

        System.out.println("Enter direction (l,r,up,down)> ");
        String direction = s.next();
        switch(direction) {
            case "l":
                shiftLeft(k, matrix);
                break;
            case "r":
                shiftRight(k, matrix);
                break;
            case "up":
                shiftUp(k, matrix);
                break;
            case "down":
                shiftDown(k, matrix);
                break;
            default:
                System.out.println("ERROR!!!");
                break;
        }
    }
}