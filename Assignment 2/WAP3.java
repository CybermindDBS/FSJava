import java.util.*;

public class WAP3 {
    public static void main(String[] args) {
        int[] arr = {3,6,2,99,74,36,88,21,95,4};
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}