import java.util.*;
public class patternInString {
    
        static void search(String pat, String txt)
        {
            int m=pat.length();
            int n=txt.length();
            for(int i=0;i<=n;i++)
            {
                int j;
                for(j=0;j<m;j++)
                {
                    if(txt.charAt(i+j) != pat.charAt(j))
                    break;
                    if(j==m)
                    System.out.println("pattern found at index " +i);
                }
            }
        }
            public static void main(String arg[]) {
                String txt="AABABBABAABAAAABAAABBAA";
                String pat="ABA";
                search(pat,txt);
            }
        
    }
