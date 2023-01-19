import java.util.*;
public class Main {
    public static void main(String[] args){
        int[] arr={5,8,5,7,8,10};
        int n = arr.length;
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++) {
            if(!visited[i])
            {
                visited[i]=true;
                int c = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        c++;
                    }
                }System.out.println(arr[i]+" "+c);
            }
        }

    }
}