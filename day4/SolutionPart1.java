package day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class SolutionPart1 {
    public static void main(String[] args) throws IOException {
        File input = new File("/home/anas/AOC/day4/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(input));
        HashSet<Character> halfSets = new HashSet<>();
        String st = "";
        int count=0;
        while((st = br.readLine()) != null) {
           String first = st.split(",")[0];
           String second = st.split(",")[1];
           String[] fSplit = first.split("-");
           String[] sSplit = second.split("-");
           if(Integer.parseInt(fSplit[0]) > Integer.parseInt(sSplit[0])){
               fSplit = sSplit;
               sSplit = first.split("-");
           }
            if(Integer.parseInt(fSplit[0]) == Integer.parseInt(sSplit[0]) &&
                    Integer.parseInt(fSplit[1]) < Integer.parseInt(sSplit[1]) ){
                fSplit = sSplit;
                sSplit = first.split("-");
            }
           if(Integer.parseInt(sSplit[0]) >= Integer.parseInt(fSplit[0]) && Integer.parseInt(sSplit[1]) <= Integer.parseInt(fSplit[1])){
               count += 1;
            }
        }
        System.out.println(count);
    }
}
