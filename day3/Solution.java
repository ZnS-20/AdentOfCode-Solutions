package day3;

import java.io.*;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        File input = new File("/home/anas/AOC/day3/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(input));
        HashSet<Character> halfSets = new HashSet<>();
        String st = "";
        int sum = 0;
        while((st = br.readLine()) != null) {
            int len = st.length(),half = len/2;
            String fHalf = st.substring(0,half);
            String sHalf = st.substring(half,len);
            for(int i=0;i<fHalf.length();i++){
                halfSets.add(fHalf.charAt(i));
            }
            for (int i=0;i<sHalf.length();i++){
                char c = sHalf.charAt(i);
                if(halfSets.contains(c)){
                    if(c > 96)
                        sum += (c-96);
                    else
                        sum += (c-64+26);
                    break;
                }
            }
            halfSets.clear();
        }
        System.out.println(sum);
    }
}
