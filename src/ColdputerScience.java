/*
rreeves1@murraystate.edu
Cold-puter Science Test on Kattis.com
3/4/17
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColdputerScience {
    public static void main(String[] args) throws IOException {
        BufferedReader readInputs = new BufferedReader(new InputStreamReader(System.in));
        readInputs.readLine();
        String[] temps = readInputs.readLine().split(" ");

        int counter = 0;

        for(int i = 0; i < temps.length; i++){
            if(Integer.parseInt(temps[i]) < 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
