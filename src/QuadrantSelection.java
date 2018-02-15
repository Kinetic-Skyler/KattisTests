import java.awt.*;
import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Point point = new Point(in.nextInt(), in.nextInt());
        double y;
        int result;

        if(point.getX() > 0){
            y = point.getY();
            if(y > 0){
                result = 1;
            }else{
                result = 4;
            }
        }
        else{
            y = point.getY();
            if(y > 0){
                result = 2;
            }
            else{
                result = 3;
            }
        }
        System.out.println(result);
    }
}
