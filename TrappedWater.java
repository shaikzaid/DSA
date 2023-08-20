package Arrays;

public class TrappedWater {

    public static void main(String[] args) {
        int[] arr={4,2,0,3,2,5};

        int trappedWater=0;

        for(int i=1;i<=arr.length-2;i++){
            int leftB=arr[i];
            for(int j=0;j<i;j++){
                if(arr[j]>leftB){
                    leftB=arr[j];
                }
            }
            int rightB=arr[i];
            for(int k=arr.length-1;k>i;k--){
                if(arr[k]>rightB){
                    rightB=arr[k];
                }
            }
            int lowerB=Math.min(leftB,rightB);

            int BlockWater=lowerB-arr[i];

            trappedWater += BlockWater;
        }
        System.out.println(trappedWater);
    }
}
