import java.util.Scanner;

public class SpeedLimit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            int sum = 0;
            int inputs = in.nextInt();

            if (inputs == -1){
                break;
            }

            int[] ints = new int[inputs * 2];

            for (int i = 0; i < ints.length; i++) {
                ints[i] = in.nextInt();
            }

            for (int i = 0; i < ints.length; i += 2){
                if (i == 0){
                    sum += ints[i] * ints[i + 1];
                } else {
                    sum += ints[i] * (ints[i + 1] - ints[i -1]);
                }
            }
            System.out.println(sum + " miles");
        }
        in.close();
    }
}
