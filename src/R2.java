import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r1 = Integer.parseInt(in.next());
        int s = Integer.parseInt(in.next());
        int r2 = ((s * 2) - r1);

        System.out.println(r2);
        in.close();
    }
}
