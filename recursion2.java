import java.util.*;
public class recursion2 {

    //TOWER OF HANOI
    //time complexity O(2^n);
//     public static void TOH(int n, String src, String help, String dest)
//     {
//         if(n==1)
//         {
//             System.out.println("move from " + src + "to " + dest);
//             return;
//         }
//         TOH(n-1, src, dest, help);
//         System.out.println("move from " + src + " to " + dest);
//         TOH(n-1,help,src,dest);
//     }
    

// public static void main(String arg[])
// {
//     int n=3;
//     String src = "A";
//     String help = "B";
//     String dest = "C";
//  TOH(n, src, help, dest);
// }

//REVERSE STRING
    // public static void printrev(String str, int inx)
    // {
    //     if(inx==0)
    //     {
    //         System.out.print(str.charAt(inx) + " ");
    //         return;
    //     }
    //     System.out.print(str.charAt(inx) +" ");
    //     printrev(str, inx-1);
    // }
    // public static void main(String arg[])
    // {
    //     String str= "abcdefg";
    //     int inx=str.length();
    //     printrev(str, inx-1);
    // }


    //FIND OCCURANCE IN STRING
    // public static int first =-1;
    // public static int last=-1;
    // public static void findOcc(String str, int inx, char element)
    // {
    //     if(inx==str.length())
    //     {
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char curr= str.charAt(inx);
    //     if(curr==element)
    //     {
    //         if(first==-1)
    //         {
    //             first=inx;
    //         }
    //         else{
    //             last=inx;
    //         }
    //     }
    //     findOcc(str, inx+1, element);
    // }
    // public static void main(String arg[])
    // {
    //     String str= "aaahaahhaahhha";
    //     findOcc(str, 0, 'a');
    // }

    //CHECK IF ARRAY IS SORTED
    // public static boolean isSorted(int arr[], int inx)
    // {
    //     if(inx==arr.length-1)
    //     {
    //         return true;
    //     }
    //     if(arr[inx]<arr[inx+1])
    //     {
    //         return isSorted(arr, inx+1); 
    //     }
    //     else{
    //         return false;
    //     }
    // }
    // public static void main(String[] args) {
    //     int arr[]= {1,2,2,4,5};
    //     System.out.println(isSorted(arr, 0));
    // }

    //MOVE ALL X
    public static void moveX(String str, int inx, int count, String newstr)
    {
        if(inx==str.length())
        {
            for(int i=0;i<count;i++)
            {
                newstr+='x';    
            }
            System.out.println(newstr);
            return;
        }
        char curr = str.charAt(inx);
        if(curr=='x')
        {
            count ++;
            moveX(str,  inx+1, count, newstr);
        }
        else{
            newstr+=curr;
            moveX(str, inx+1, count, newstr);
        }
    }
    public static void main(String arg[]) {
        String str="axxbcxxd";
        String newstr=" ";
        moveX(str, 0, 0, newstr);
        
    }
}


