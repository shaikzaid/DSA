package LogicProblems;

import java.util.Scanner;

public class DifferenceOfTwoArray {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        int n1=scn.nextInt();
        int[] a1= new int[n1];
        for(int i= 0;i<a1.length;i++){
            a1[i]=scn.nextInt();
        }

        int n2=scn.nextInt();
        int[] a2= new int[n2];
        for(int i= 0;i<a2.length;i++){
            a2[i]=scn.nextInt();
        }

        int[] diff=new int[a2.length];

        int a=a1.length-1;
        int b=a2.length-1;
        int k=diff.length-1;
        int c=0;

        while(k > 0){
            int d=0;
            int a1v= a >= 0 ? a1[a] :0;
            if(a2[b]+c >= a1v){
                d=a2[b] - a1v;
                c = 0;
            } else {
                d= (a2[b] + c +10)-a1v;
                c = -1;
            }
            diff[k]=d;
            a--;
            b--;
            k--;
        }
        int idx = 0;
        while(idx < diff.length){
            if(diff[idx] ==0){
                idx ++;
            }else{
                break;
            }
        }
        while(idx < diff.length){
            System.out.println(diff[idx]);
            idx++;
        }
    }

}
