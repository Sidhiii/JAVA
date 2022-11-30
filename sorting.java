import java.util.*;

public class sorting {
    public static void main(String arg[]) {
        int arr[] = { 7, 8, 1, 3, 2 };

        // BUBBLE SORT
        // take the element 1 by 1. compare with the next and swap
        // time complexity = O(n^2);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // SELECTION SORT
        // take an element and compare with rest of the array. when the smaller no. is
        // found , then swap
        // time complexity = O(n^2);
        // for(int i=0;i<arr.length-1;i++)
        // {
        // int smallest = i;
        // for(int j=i+1;j<arr.length;j++) //j=i+1 cuz first element is already sorted
        // {
        // if(arr[smallest]>arr[j])
        // {
        // smallest=j;
        // }
        // }
        // int temp=arr[smallest];
        // arr[smallest]=arr[i];
        // arr[i]=temp;
        // }

        // INSERTION SORT
        // sorted and unsorted array. take element from unsorted array and insert it in
        // sorted position
        // time complexity= O(n^2);
        // for(int i=1;i<arr.length;i++)
        // {
        // int curr=arr[i];
        // int j=i-1;
        // while(j>=0 && curr<arr[j])
        // {
        // arr[j+1]=arr[j];
        // j--;
        // }
        // //placement
        // arr[j+1]=curr;
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
