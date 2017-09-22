import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.next();
        String output = input.charAt(0) + "";

        int i = 0;
        while(i < input.length()){
            if(input.charAt(i) != '-'){
                i++;
            } else {
                output += input.charAt(i+1);
                i++;
            }
        }
        System.out.println(output);
    }
}
