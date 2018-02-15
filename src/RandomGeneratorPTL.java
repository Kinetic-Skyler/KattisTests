import java.util.Random;

public class RandomGeneratorPTL {
    public static void main(String[] args) {

        Random randomNum = new Random();

        int[] set = new int[1440];
        int[] lottery = new int[400];

        for(int i = 0; i < 1440; i++){
            set[i] = i+1;
        }

        for (int i = 0; i < 400; i++){
            int n = (randomNum.nextInt(1439)+1);
            for (int x = 0; x < i; x++){
                if(set[x] == n){
                    n = randomNum.nextInt(1439)+1;
                    x = -1;
                }
            }
            lottery[i] = n;
        }

        for(int i : lottery)
            System.out.println(i);
    }
}
