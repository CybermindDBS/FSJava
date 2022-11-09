import java.util.*;

public class WAP2 {
    public static int n;
    public static ArrayList<Integer> al = new ArrayList<Integer>();
    public static int[] arr = {23,12,5476,2,34,1,6898,435,764,3};
    static void swap(int lptr, int rptr)
    {

        int temp;
        temp = arr[rptr];
        arr[rptr] = arr[lptr];
        arr[lptr] = temp;
    }
    static void quickSort(int lptr, int rptr,int pivot) throws Exception
    {
        pivot = rptr;
        while(lptr!=rptr)
        {
            if (pivot == rptr)
            {
                if(arr[rptr]>=arr[lptr])
                {
                    lptr++;
                }
                else if (arr[rptr]<=arr[lptr])
                {
                    swap(lptr,rptr);
                    pivot = lptr;
                }
            }
            else if(pivot == lptr)
            {
                if(arr[lptr]>=arr[rptr])
                {
                    swap(lptr,rptr);
                    pivot = rptr;
                }

                else if (arr[lptr]<=arr[rptr])
                {
                    rptr--;
                }
            }
        }
        if(lptr == rptr)
        {
            al.add(pivot);
            Collections.sort(al);
            lpartition(lptr, rptr, pivot);
            rpartition(lptr, rptr, pivot);
        }
    }
    static void lpartition(int lptr, int rptr, int pivot) throws Exception
    {
        int x1,x2;
        x1 = xPivot(0,pivot)+1;
        x2 = pivot-1;
        if(pivot-1 == xPivot(0,pivot)+1 || pivot == xPivot(0,pivot)+1)
        {
            return;
        }
        quickSort(x1, x2,pivot);
    }
    static void rpartition(int lptr, int rptr, int pivot) throws Exception
    {
        int x3,x4;
        x3 = pivot+1;
        x4 = xPivot(1,pivot)-1;
        if(pivot+1 == xPivot(1,pivot)-1 || pivot == xPivot(1,pivot)-1)
        {
            return;
        }
        quickSort(x3, x4,pivot);
    }
    static int xPivot(int direction,int pivot)
    {
        int xpivot = 0;
        if (direction == 0)
        {
            try
            {
                xpivot = al.get(al.indexOf(pivot)-1);
            } catch (Exception e)
            {
                xpivot = -1;
            }
        }
        else if(direction == 1)
        {
            try
            {
                xpivot = al.get(al.indexOf(pivot)+1);
            } catch (Exception e)
            {
                xpivot = n;
            }
        }
        return xpivot;
    }


    public static void main(String Args[]) throws Exception
    {
        int lptr,rptr,pivot;
        n = arr.length;
        lptr = 0;
        rptr = n-1;
        pivot = rptr;
        quickSort(lptr,rptr,pivot);
        System.out.println(Arrays.toString(arr));
    }

}
