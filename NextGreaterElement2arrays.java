package Arrays;

public class NextGreaterElement2arrays {
    public static void main(String[] args) {
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};
        int[] arrR = new int[nums1.length];
        int h = 0;

        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            while (nums2[j] != nums1[i]) {
                j++;
            }

            int nextGreater = -1;
            for (int k = j + 1; k < nums2.length; k++) {
                if (nums2[k] > nums2[j]) {
                    nextGreater = nums2[k];
                    break;
                }
            }

            arrR[h] = nextGreater;
            h++;
        }

        //return arrR;
    }
}
