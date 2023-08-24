package Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits={1,2,3};
        int[] arr=new int[digits.length+1];
        int n= digits.length;
        for(int i=n-1;i>=0;i--){    // classy example  if less than 9 just increment and return
            if(digits[i] < 9){    // if not then make current 0 in next loop it might be less than 9 if not repeat
                digits[i]++;       //
                break;;
               // return digits;
            }
            digits[i]=0;
        }
        arr[0]=1;             // for input such as 9 or 99 , 999 where the size will increase be smart just
      //  return arr;         // increament array make arr[0] 1 return using remaining zeros
                             /// examplwe 999 will become 1000
    }
}
