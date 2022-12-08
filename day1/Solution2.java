package day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World");
        File input = new File("/home/anas/AOC/day1/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(input));
        ArrayList<Integer> list = new ArrayList<>();
        int sumSoFar = 0;
        String st = "";
        while((st = br.readLine()) != null){
            try{
                int n = Integer.parseInt(st);
                sumSoFar += n;
            }catch(Exception e){
                list.add(sumSoFar);
                sumSoFar = 0;
            }
        }
        Collections.sort(list);
        int sum = 0,size = list.size();
        for(int i=0;i<3;i++){
            sum += list.get(size-1-i);
        }
        br.close();
        System.out.println(sum);
    }
}
