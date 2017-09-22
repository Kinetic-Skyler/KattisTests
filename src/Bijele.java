import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] inputArray = input.split(" ");
        int[] intArray = new int[6];

        for(int i = 0; i < inputArray.length; i++){
            intArray[i] = Integer.parseInt(inputArray[i]);
        }

        /*Correct amount of pieces for King, Queen, Rooks, Bishops, Knights, and Pawns respectively*/
        int[] correctAmount = {1, 1, 2, 2, 2, 8};
        List<Integer> output = new LinkedList<>();

        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] != correctAmount[i]){
                if(intArray[i] < correctAmount[i]){
                    output.add(correctAmount[i] - intArray[i]);
                }
                else{output.add((intArray[i] - correctAmount[i]) * -1);}
            }
            else{output.add(0);}
        }

        StringBuilder builder = new StringBuilder();
        for(Integer i : output){
            if(builder.length() != 0){
                builder.append(" ");
            }
            builder.append(i);
        }

        System.out.println(builder);
    }
}
