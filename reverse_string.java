import java.util.*;
public class reverse_string {
    public static void main(String arg[]){
        StringBuilder sb= new StringBuilder("hello");
        for(int i=0;i<sb.length()/2;i++)
        {
            int front =i;
            int back=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.print(sb);
    }
}
