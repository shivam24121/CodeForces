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
            
            long[] arr=new long[n];
            st=new StringTokenizer(br.readLine());
            
            for(int i=0;i<n;i++){
                arr[i]=Long.parseLong(st.nextToken());
            }
            Arrays.sort(arr);
            
            long alice=0;
            long bob=0;
            
            long ans=0;
            
            for(int i=n-1;i>0;i-=2){
                long diff=arr[i]-arr[i-1];
                long take=Math.min(diff,k);
                diff-=take;
                k-=take;
                ans+=diff;
            }
            if(n%2==1){
                ans+=arr[0];
            }
            
            System.out.println(ans);
        }
    }
}
