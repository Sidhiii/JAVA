import java.util.*;
public class recursion3 {
    //PRINT ALL PERMUTATIONS
    // public static void perm(String str, String perm)
    // {
    //     if(str.length()==0)
    //     {
    //         System.out.println(perm);
    //     }
    //     for(int i=0;i<str.length();i++)
    //     {
    //     char curr= str.charAt(i);
    //     String newstr= str.substring(0, i) + str.substring(i+1);
    //     perm(newstr, perm +curr);
    //     }
    // }
    // public static void main(String arg[]) {
    //     String str= "abc";
    //     perm(str, "");
    // }

    //TOTAL NUMBER OF PATHS
    // public static int paths(int n, int m)
    // {
    //     if(n==1 || m==1)
    //     {
    //         return 1;
    //     }
    //    return paths(n, m-1) + paths(n-1, m);
    // }
    // public static void main(String arg[])
    // {
    //     int n=3;
    //     int m=3;
    //     System.out.print(paths(n, m));
    // }      
  

    //PLACE 1Xm tiles on nXm floor
    public static int place(int n, int m)
    {
        if(n==m)
        {
            return 2;
        }
        if(n<m)
        {
            return 1;
        }
        int vert= place(n-m, m);
        int horz= place(n-1, m);
        return vert+horz;
    }
    public static void main(String[] args) {
        int n=4;
        int m=2;
        System.out.println(place(n, m));
    }
}
