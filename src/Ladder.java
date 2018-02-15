import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int v = in.nextInt();

        System.out.println((int) (Math.ceil(1 / (Math.sin(v * (Math.PI / 180)) / h))));

        in.close();
    }
}
