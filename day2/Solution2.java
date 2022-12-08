package day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        File input = new File("/home/anas/AOC/day2/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(input));
        int totalScore = 0;
        String st = "";
        while ((st = br.readLine()) != null) {
            String[] temp = st.split(" ");
            if (temp[0].equals("A")) {
                if (temp[1].equals("X")) //Lose
                    totalScore += 3;
                else if (temp[1].equals("Y")) //Draw
                    totalScore += 4;
                else //Win
                    totalScore += 8;
            } else if (temp[0].equals("B")) {
                if (temp[1].equals("X")) //choose Rock +1
                    totalScore += 1;
                else if (temp[1].equals("Y")) //choose Paper +2
                    totalScore += 5;
                else //choose Scissors +3
                    totalScore += 9;
            } else {
                if (temp[1].equals("X")) //choose Rock +1
                    totalScore += 2;
                else if (temp[1].equals("Y")) //choose Paper +2
                    totalScore += 6;
                else //choose Scissors +3
                    totalScore += 7;
            }
        }
        System.out.println(totalScore);
    }
}
