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
            long k=Long.parseLong(st.nextToken());
            
            long[] a=new long[n];
            long[] b=new long[n];
            
            st=new StringTokenizer(br.readLine());
            
            for(int i=0;i<n;i++){
                a[i]=Long.parseLong(st.nextToken());
            }
            
            st=new StringTokenizer(br.readLine());
            
            for(int i=0;i<n;i++){
                b[i]=Long.parseLong(st.nextToken());
            }
            
            long max=a[0];
            
            long[] kl=new long[n];
            long[] kr=new long[n];
            
            kl[0]=a[0];
            kr[n-1]=a[n-1];
            
            for(int i=1;i<n;i++){
                kl[i]=Math.max(a[i],kl[i-1]+a[i]);
                max=Math.max(max,kl[i]);
            }
            if(k%2==0){
                System.out.println(max);
                continue;
            }
            
            for(int i=n-2;i>=0;i--){
                kr[i]=Math.max(a[i],kr[i+1]+a[i]);
            }
            
            long ans=Long.MIN_VALUE;
            
            for(int i=0;i<n;i++){
                ans=Math.max(ans,kl[i]+kr[i]+b[i]-a[i]);
            }
            
            System.out.println(ans);
        }
    }
}
