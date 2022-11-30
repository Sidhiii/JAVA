import java.util.*;
import java.util.Scanner;

public class binary_search {
    public static void main(String arg[]){
        int arr[];
        arr= new int[100];
        int s;
        int search;
        Scanner sc = new Scanner(System.in);
        s=sc.nextInt();
        for(int i=1;i<=s;i++)
        {
            arr[i]=sc.nextInt();
        }
        search = sc.nextInt();
        int s1=0; 
        int e=s;
        while(s1<=e)
        {
            int mid=(s1+e)/2;
            if(arr[mid]==search)
            {
                System.out.println("Value is present at " + mid);
                break;
            }
            else if(arr[mid]>search)
            {
                e=mid-1;
            }
            else
            {
                s1=mid+1;
            }
        }
    }
}
