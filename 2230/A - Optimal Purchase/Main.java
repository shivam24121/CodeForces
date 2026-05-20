import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            st=new StringTokenizer(br.readLine());
            
            int n=Integer.parseInt(st.nextToken());
            int a=Integer.parseInt(st.nextToken());
            int g=Integer.parseInt(st.nextToken());
            
            if(n<=3){
                System.out.println(Math.min(n*a,g));
                continue;
            }
            else{
                int min=Math.min(3*a,g);
                int number=n/3;
                int rem=n%3;
                long cost=min*1L*number;
                cost+=Math.min(a*rem,g);
                System.out.println(cost);
            }
        }
    }
}
