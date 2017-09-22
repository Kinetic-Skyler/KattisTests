import java.util.Scanner;

public class Tarifa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int result = x * (n + 1);
        for (int i = 0; i < n; i++) {
            result -= in.nextInt();
        }
        System.out.println(result);
    }
}