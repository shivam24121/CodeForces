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
            int k=Integer.parseInt(st.nextToken());
            
            st=new StringTokenizer(br.readLine());
            
            long sum=0;
            
            for(int i=0;i<n;i++){
                sum+=Integer.parseInt(st.nextToken());
            }
            
            System.out.println((sum%2==1 || (k*n)%2==0)?"YES":"NO");
        }
    }
}
