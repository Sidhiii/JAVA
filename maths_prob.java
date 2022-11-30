import java.util.*;

public class maths_prob {
    public static void main(String args[]) {
        // GCD
        // Scanner sc= new Scanner(System.in);
        // int a= sc.nextInt();
        // int b=sc.nextInt();
        // int gcd=1;
        // for(int i=1;i<=a && i<=b;i++)
        // {
        // if(a%i==0 && b%i==0)
        // {
        // gcd=i;
        // }
        // }
        // System.out.print(gcd);

        // PRIME FACTOR
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                n = n / i;
            }
            System.out.println(i);
        }
        if (n != 1) {
            System.out.println(n);
        }

        // DISTRIBUTE IN A CIRCLE
        // Scanner sc= new Scanner(System.in);
        // int size=sc.nextInt();
        // int items=sc.nextInt();
        // int sp=sc.nextInt();

        // int n= (sp+items-1)%size;
        // if(n==0)
        // {
        // System.out.println(size);
        // }
        // else{
        // System.out.println(n);
        // }

    }
}
