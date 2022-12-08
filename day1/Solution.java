package day1;

import java.io.*;

public class Solution{
	
	public static void main(String[] args) throws IOException{
		System.out.println("Hello World");
		File input = new File("/home/anas/AOC/day1/input.txt");
		BufferedReader br = new BufferedReader(new FileReader(input));
		int max = Integer.MIN_VALUE, sumSoFar = 0;
		String st = "";
		while((st = br.readLine()) != null){
			try{
				int n = Integer.parseInt(st);
				sumSoFar += n;
			}catch(Exception e){
				max = sumSoFar > max ? sumSoFar : max;
				sumSoFar = 0;
			}
		}
		br.close();
		System.out.println(max);
	}
}