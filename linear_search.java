import java.util.*;
import java.util.Scanner;
    public class linear_search{
    public static void main(String arg[]) {
        int arr[];
        arr = new int[100];
        int s;
        int search;
        Scanner sc = new Scanner(System.in);
        s=sc.nextInt();
        for(int i=1;i<=s;i++)
        {
            arr[i]=sc.nextInt();
        }
        search= sc.nextInt();
        for(int i=1;i<=s;i++)
        {
            if(arr[i]==search)
            {
                System.out.println("Value is present at " +i);
            }
            if(i==s)
            {
                System.out.println("Value not found");
            }
        }
        
        
    }
}


