import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//2. Создать приложение, которое отображает в окне консоли аргументы командной строки метода main() в обратном порядке.
public class Main {
    public static void main(String[] args) {
      List<String> list = Arrays.asList(args);
      Collections.reverse(list);
      System.out.println(String.join(" ", list));
    }
}