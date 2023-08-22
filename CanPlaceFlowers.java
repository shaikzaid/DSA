package Arrays;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed={1,0,0,0,0,1};
        int n =2;
        int count =0;
        if(n== 0){
           // return true;
        }
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1] == 0)&&     // checking if i is at 0 then no need to check [i-1]
                    (i == flowerbed.length-1 || flowerbed[i+1]== 0)){//thats why " || " operator if one runs other dont
                flowerbed[i]= 1;
                count++;
                if(count == n){
                   // return true;
                }
            }
        }
       // return false;
    }
}
}
