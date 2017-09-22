import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ballLocation = 0;
        String moves = in.next();

        for (int i = 0; i < moves.length(); i++){
            if (moves.charAt(i) == 'A' && ballLocation != 2){
                ballLocation = 1 - ballLocation;
            }

            if (moves.charAt(i) == 'B' && ballLocation != 0){
                ballLocation = -ballLocation + 3;
            }

            if (moves.charAt(i) == 'C' && ballLocation != 1){
                ballLocation = -ballLocation + 2;
            }
        }
        System.out.println(ballLocation + 1);
        in.close();
    }
}
