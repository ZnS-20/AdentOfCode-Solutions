package day2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution{

    public static void main(String[] args) throws IOException{
        File input = new File("/home/anas/AOC/day2/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(input));
        int totalScore = 0;
        String st = "";
        while((st = br.readLine()) != null){
           String[] temp = st.split(" ");
           if(temp[0].equals("A")) {
               if(temp[1].equals("X")) //choose Rock +1
                   totalScore += 4;
               else if(temp[1].equals("Y")) //choose Paper +2
                   totalScore += 8;
               else //choose Scissors +3
                   totalScore += 3;
           }
           else if(temp[0].equals("B")){
               if(temp[1].equals("X")) //choose Rock +1
                   totalScore += 1;
               else if(temp[1].equals("Y")) //choose Paper +2
                   totalScore += 5;
               else //choose Scissors +3
                   totalScore += 9;
           }
           else{
               if(temp[1].equals("X")) //choose Rock +1
                   totalScore += 7;
               else if(temp[1].equals("Y")) //choose Paper +2
                   totalScore += 2;
               else //choose Scissors +3
                   totalScore += 6;
           }
        }
        System.out.println(totalScore);
    }
}