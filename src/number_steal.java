import java.util.Scanner;

public class number_steal {

    class MyNumber {
        public static void main(String[] args) {
            Scanner src = new Scanner(System.in);
            int x = src.nextInt();
            int i = 1;
            while (i * i <= x) {
                System.out.println(i * i);
                i += 1;
            }
        }
    }
}