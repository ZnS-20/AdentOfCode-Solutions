package day3;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        File input = new File("/home/anas/AOC/day3/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(input));
        HashMap<Character,Integer> triplet = new HashMap<>();
        String st = "";
        int sum = 0;
        int set = 0;
        while((st = br.readLine()) != null) {
            if(set == 0){
                for(int i=0;i<st.length();i++){
                    char c = st.charAt(i);
                    triplet.put(c,1);
                }
            }else if(set == 1){
                for(int i=0;i<st.length();i++){
                    char c = st.charAt(i);
                    if(triplet.containsKey(c))
                        triplet.put(c,2);
                }
            }else{
                for(int i=0;i<st.length();i++){
                    char c = st.charAt(i);
                    if(triplet.containsKey(c)){
                        if(triplet.get(c) == 2){
                            if(c > 96)
                                sum += (c-96);
                            else
                                sum += (c-64+26);
                            break;
                        }
                    }
                }
            }
            set++;
            set = set%3;
            if(set == 0)
                triplet.clear();
        }
        System.out.println(sum);
    }
}
