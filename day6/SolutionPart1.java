package day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionPart1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        int start = 0,end = input.length(),matched=0;
        List<Character> characterList = new ArrayList<>();
        while(start<end){
            char c = input.charAt(start);
            if(characterList.contains(c)){
                int toSub = findOnLeft(characterList,start,c);
                matched -= toSub;
            }else{
                characterList.add(c);
                matched++;
            }
            start++;
            if(matched == 14)
                break;
        }
        System.out.println(start);
    }

    private static int findOnLeft(List<Character> input, int start,char key) {
        for(int i=0;i<start;i++){
            char c = input.get(i);
            if(c == key) {
                int remove = i;
                while(remove >= 0)
                    input.remove(remove--);
                input.add(c);
                return i;
            }
        }
        return 0;
    }
}
