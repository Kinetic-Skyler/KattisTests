import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String[] inputs = input.split(" ");
        int hours = Integer.parseInt(inputs[0]);
        int minutes = Integer.parseInt(inputs[1]);

        int differenceMinutes = minutes - 45;
        if(differenceMinutes < 0){
            minutes = 60 + differenceMinutes;

            int differenceHours = hours - 1;
            if(differenceHours < 0){
                hours = 23;
            }
            else{ hours--; }
        }
        else { minutes = differenceMinutes; }

        System.out.println(hours + " " + minutes);
    }

}
