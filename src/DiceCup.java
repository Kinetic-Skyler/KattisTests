import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Scanner;

public class DiceCup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int max = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= b; j++){
                map.put(i + j, map.containsKey(i + j) ? map.get(i + j) + 1 : 1);
            }
        }

        for(int sum : map.keySet()){
            max = Math.max(max, map.get(sum));
        }

        for(int sum : map.keySet()){
            if(map.get(sum) == max){
                System.out.println(sum);
            }
        }
        in.close();
    }

    /*public static AbstractMap<Integer, Integer> getFrequenciesByOutcome(int mDice, int nSides){
        int maxOutcome = (mDice * nSides);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i <= maxOutcome; i++){
            map.put(0, 0);
        }

        for(int possibleOutcome : getAllOutcomes())

        HashMap result = map;
        return result;
    }*/


}
