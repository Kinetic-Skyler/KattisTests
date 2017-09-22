import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = Integer.parseInt(in.nextLine());

        int[] inputArray = new int[input];

        for(int i = 0; i < input; i++){
            inputArray[i] = Integer.parseInt(in.next());
        }

        for(int i = 0; i < input; i++){
            if(inputArray[i] % 2 == 0){
                System.out.println(inputArray[i] + " is even");
            }
            else{ System.out.println(inputArray[i] + " is odd"); }
        }
    }
}



