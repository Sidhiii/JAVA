import java.util.*;

public class recursion {

    //FACTORIAL
    // public static int fact(int n)
    // {
    //     if(n==1 || n==0)
    //     {
    //         return 1;
    //     }
    //     int f_nm1= fact(n-1);
    //     int f= n*f_nm1;
    //     return f;
    // }
    // public static void main(String arg[])
    // {
    //     int n=5;
    //     int ans = fact(n);
    //     System.out.println(ans);
    // }
    

    //FIBONACCI
    // public static void fibonacci(int a, int b, int n)
    // {
    //     if(n==0)
    //     {
    //         return;
    //     }
    //     int c= a+b;
    //     System.out.print(c +" ");
    //     fibonacci(b, c, n-1);
    // }
    // public static void main(String arg[])
    // {
    //     int a=0; 
    //     int b=1;
    //     System.out.print(a + " " + b +" ");
    //     int n=7;
    //     fibonacci(a, b, n-2);
    // }


    //CALCULATE x^n
    // public static int calcPower(int x, int n)
    // {
    //     if(n==0)
    //     {
    //         return 1;
    //     }
    //     if(x==0)
    //     {
    //         return 0;
    //     }
    //     int xpownm1 = calcPower(x, n-1);
    //     int xpown = x* xpownm1;
    //     return xpown;
    // }
    // public static void main(String arg[])
    // {
    //     int x=2;
    //     int n=5;
    //     int ans = calcPower(x, n);
    //     System.out.println(ans);
    // }


    //CALCULATE x^n (stack heinght = logn)
    public static int calcPower(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
    if(n%2==0)
    {
        return calcPower(x, n/2) * calcPower(x, n/2);
    }
    else{
        return calcPower(x, n/2) * calcPower(x, n/2) * x;
    }

}
 public static void main(String arg[])
    {
        int x=2;
        int n=5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}

