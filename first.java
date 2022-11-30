import java.util.Arrays;
import java.util.Scanner;
// class first{
//     public static void main(String[] args) {
//         System.out.println("hello");
//     }
// }
// class first{
//     public static void main(String[] args) {
//         int a=10;
//         int b=20;
//         System.out.println(a+b+"hello"+b+a); //30hello2010
//     }
// }

class first{
    public static void main(String[] args) {
        // int size=5;
       // int arr[] = new int[size];
        //int arr[]= new int[]{11,2,33,44,5};
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] = new int[size];
        int i=0;
        while(size!=0)
        {
            int value = sc.nextInt();
            arr[i]=value;
            i++;
            size--;
        }
        //Arrays.fill(arr,-1);
        // System.out.println(arr[0]);
        // System.out.println(arr.length);
        // Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,6));
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
        
}