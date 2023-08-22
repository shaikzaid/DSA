package Arrays;

import java.util.ArrayList;

public class BaseBallGame {
    public static void main(String[] args) {
        String[] operations={"5","2","C","D","+"};
        int sum=0;
        ArrayList<Integer> h= new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int k = h.get(h.size() - 1) + h.get(h.size() - 2);
                h.add(k);
            } else if (operations[i].equals("D")) {
                int k = h.get(h.size() - 1) * 2;
                h.add(k);
            } else if (operations[i].equals("C")) {
                h.remove(h.size() - 1);
            } else {
                int k = Integer.parseInt(operations[i]);
                h.add(k);
            }
        }

        for (int str : h) {
            int value = str;
            sum += value;
        }
        System.out.println(sum);
//        return true;
    }
}
