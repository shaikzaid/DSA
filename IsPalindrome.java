package LogicProblems;

import java.util.ArrayList;

public class IsPalindrome {
    public static void main(String[] args) {
        int x = 121;
        ArrayList<Integer> arr = new ArrayList<>();
        if (x < 0) {
            //return false;
            System.out.println("Not a palindrome");
        }
        x = Math.abs(x);
        while (x > 0) {
            arr.add(x % 10);
            x = x / 10;
        }
        int start = 0;
        int end = arr.size() - 1;
        while (start < end) {
            if (arr.get(start) != arr.get(end)) {
                System.out.println("Not a palindrome");
               // return false;
            }
            start++;
            end--;
        }
    }
}