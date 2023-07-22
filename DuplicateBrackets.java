package LogicProblems;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        Stack<Character> st= new Stack<>();
        String sam= scn.nextLine();
        for(int i=0; i < sam.length();i++){
            char ch= sam.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println("duplicate");
                    return;
                }
                else{
                    while(st.peek() == '('){
                    st.pop();}
                }
                st.pop();
            }else{
                st.push(ch);
            }
        }
    }
}