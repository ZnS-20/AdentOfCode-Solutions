package day5;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class SolutionPart1 {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/anas/AOC/day5/input.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        Scanner sc = new Scanner(System.in);
        Stack<Character>[] stacks = new Stack[9];
        for(int i=0;i<9;i++){
            Stack<Character> stack = new Stack<>();
            String characters = sc.nextLine();
            for(int j=0;j<characters.length();j++) {
                stack.push(characters.charAt(j));
            }
            stacks[i] = stack;
        }
        String st = "";
        while((st = bufferedReader.readLine())!=null){
            String[] instructions = st.split(" ");
            int toPop = Integer.parseInt(instructions[1]);
            int fromStack = Integer.parseInt(instructions[3]);
            int toStack = Integer.parseInt(instructions[5]);
            performOperation(stacks[fromStack-1],stacks[toStack-1],toPop);
        }
        for(int i=0;i<stacks.length;i++){
            if(stacks[i].isEmpty())
                continue;
            System.out.print(stacks[i].peek());
        }
        System.out.println();
    }

    private static void performOperation(Stack<Character> stack, Stack<Character> stack1, int toPop) {
       while (toPop!=0&&!stack.isEmpty()){
           char c = stack.pop();
           stack1.push(c);
           toPop--;
       }
    }
}
