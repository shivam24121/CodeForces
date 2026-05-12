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
            
            long n=Long.parseLong(st.nextToken());
            long m=Long.parseLong(st.nextToken());
            
            long l=Math.max(0,n-m);
            long r=n+m;
            
            long res=r;
            
            for(int i=0;i<32;i++){
                int mask=1<<i;
                
                if((mask&l)!=(mask&r)){
                    res|=(mask-1);
                }
            }
            System.out.println(res);
        }
    }
}
