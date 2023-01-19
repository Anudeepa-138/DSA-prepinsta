/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.*/
public class Search {
    public static void main(String[] args)
    {
        int[] arr = {1,3,5,6};
        int k=2;
        int i=0,idx=-1;
        int j=arr.length-1;
        while(i<=j)
        {
            int mid = i+(j-i)/2;
            if(arr[mid]==k)
            {
                idx=mid;
            }
            else if(arr[mid]>k)
            {
                j=mid-1;
            }
            else {
                i=mid+1;
            }
        }
        System.out.print(idx);

    }
}
