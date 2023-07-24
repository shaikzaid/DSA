package LogicProblems;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementToTheRight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter number of elements");
        int n= scn.nextInt();
        int[] n1= new int[n];
        for(int i=0;i<n1.length;i++){
            n1[i]=scn.nextInt();
        }
        int[] m1=new int[n1.length];

        Stack<Integer> st= new Stack<>();
        st.push(n1[n1.length-1]);
        m1[m1.length-1]=-1;
        for(int i= n1.length-2;i>=0;i--){
            while(st.size() != 0 && st.peek() <= n1[i]){
                st.pop();
            }
            if(st.size() == 0){
                m1[i]=-1;
            } else if (st.peek() > n1[i]) {
                m1[i]=st.peek();

            }
            st.push(n1[i]);
        }
        for(int i=0;i<m1.length;i++){
            System.out.println(m1[i]);
        }
    }
}

