import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte l, r;
        l = in.nextByte();
        r = in.nextByte();

        if(l > r || r > l){
            System.out.println((l < r) ? "Odd " + r*2 : "Odd " + l*2);
        }
        else{
            System.out.println((l+r==0) ? "Not a moose" : "Even " + l*2);
        }
    }
}
