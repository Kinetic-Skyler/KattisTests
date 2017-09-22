import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matrix = new int[5][4];

        for(int i = 0; i < 5; i++){
            int score = 0;
            for(int j = 0; j < 4; j++){
                matrix[i][j] = in.nextInt();
            }
        }

        int maxSum = 0;
        int maxRow = 0;

        for(int row = 0; row < matrix.length; row++){
            int rowSum = 0;

            for(int col = 0; col < matrix[row].length; col++){
                rowSum += matrix[row][col];
            }

            if(rowSum > maxSum){
                maxSum = rowSum;
                maxRow = row + 1;
            }
        }
        System.out.println(maxRow + " " + maxSum);
        in.close();
    }
}

