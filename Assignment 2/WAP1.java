import java.util.*;

public class WAP1 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 5, 6, 8, 3, 4, 9, 11, 54, 43, 4};
        HashMap<Integer, Integer> m1 = new HashMap<Integer, Integer>();
        for (int x : arr) {
            if (m1.containsKey(x)) {
                int tmp = m1.get(x);
                m1.put(x, ++tmp);
            } else
                m1.put(x, 1);
        }
        for (int x : m1.keySet()) {
            if (m1.get(x) > 1)
                System.out.println("Duplicate of " + x + ", Total Occurence : " + m1.get(x) + " times");
        }
    }
}