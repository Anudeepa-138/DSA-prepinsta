import java.util.*;
public class Hashing {
    public static void main(String[] args)
    {
        int arr[]={3,2, 1, 1, 1 ,2, 1, 1, 1, 2, 3, 2, 1, 1, 1, 2, 1, 1, 1, 2, 3};
        int n=arr.length;
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(arr[i]))
            {
                h.put(arr[i],h.get(arr[i])+1);
            }
            else {
                h.put(arr[i],1);
            }
        }
        int max = (Collections.max(h.values()));
        int min = (Collections.min(h.values()));
        for(Map.Entry<Integer,Integer> entry:h.entrySet())
        {
            if(entry.getValue()==max)
            {
                System.out.println("highest="+entry.getKey());
            }
            if(entry.getValue()==min)
            {
                System.out.println("lowest="+entry.getKey());
            }
        }
        System.out.print(max+" "+min);
    }
}
