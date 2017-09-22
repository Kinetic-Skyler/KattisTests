import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfMatches = in.nextInt();
        int boxWidth = in.nextInt();
        int boxLength = in.nextInt();
        double hypotenuse = Math.sqrt(boxWidth * boxWidth + boxLength * boxLength);

        for(int i = 0; i < numOfMatches; i++){
            if(in.nextInt() <= hypotenuse){
                System.out.println("DA");
            }
            else {
                System.out.println("NE");
            }
        }
    }
}
