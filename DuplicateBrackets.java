package LogicProblems;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
                                                  //   Scanner object to get input String
        Stack<Character> st= new Stack<>();      //Stack character which is a wrapper class

        String str=scn.nextLine();

        for(int i=0;i< str.length();i++){  // for loop to iterate all over the String

            char ch=str.charAt(i);    //using charAt to get character at specific index

            if(ch == ')'){      //outer if else to check wheather to push,pop
                if(st.peek() == '('){  //inner if else
                    System.out.println("duplicate");
                    return;
                }else{
                    while (st.peek() == '('){
                        st.pop();
                    }
                }
                st.pop();
            }else{             // if not " ) " then everything needs to be pushed into the stack
                st.push(ch);
            }
        }
    }
}