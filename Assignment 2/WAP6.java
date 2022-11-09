import java.util.*;

public class WAP6 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 6, 7, 8};
        int arr2[] = {1, 3, 6};
        if (isSubset(arr2, arr)) {
            System.out.println("The array is a subset");
        } else
            System.out.println("The array is not a subset");
    }

    static boolean isSubset(int[] arr2, int[] arr) {
        ArrayList mainArray = new ArrayList();
        ArrayList checkingArray = new ArrayList();
        for (int x : arr2) {
            checkingArray.add(x);
        }
        for (int x : arr)
            mainArray.add(x);

        if (mainArray.containsAll(checkingArray))
            return true;
        else
            return false;
    }
}