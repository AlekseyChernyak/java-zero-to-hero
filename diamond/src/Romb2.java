import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Romb2 {
    public static void main(String[] args) throws IOException {
        System.out.println("введите размер ромба");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
