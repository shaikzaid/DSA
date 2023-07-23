package LogicProblems;
import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);

      String str= scn.nextLine();
      Stack<Character> st=new Stack<>();

      for(int i= 0 ; i<str.length();i++) {  
          char ch = str.charAt(i);
          if(ch == '(' || ch == '{'||ch=='['){
              st.push(ch);
          }else if (ch == ')'){               // we can make method which takes stack and type of bracket and give us true or false 
              if(st.size() == 0){
                  System.out.println(false);
              }
          }else if(ch == '}'){
              if(st.size() == 0){
                  System.out.println(false);
              }else if(st.peek() != '{'){
                  System.out.println(false);
              }
          }else if(ch == ']'){
              if(st.size() == 0){
                  System.out.println(false);
              }else if(st.peek() != '['){
                  System.out.println(false);
              }

          }

      }
      if(st.size() == 0){
          System.out.println(false);
      }else{
          System.out.println(true);
      }
    }
}
