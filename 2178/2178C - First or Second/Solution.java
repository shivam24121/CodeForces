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
            
            int n=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            
            long[] arr=new long[n];
            
            for(int i=0;i<n;i++){
                arr[i]=Long.parseLong(st.nextToken());
            }
            
            long[] prefix=new long[n];
            long[] suffix=new long[n];
            
            prefix[0]=0;
            suffix[n-1]=0;
            
            for(int i=1;i<n;i++){
                prefix[i]=prefix[i-1]+Math.abs(arr[i]);
            }
            for(int i=n-2;i>=0;i--){
                suffix[i]=suffix[i+1]-arr[i+1];
            }
            
            long ans=suffix[0];
            
            for(int i=1;i<n;i++){
                ans=Math.max(ans,prefix[i-1]+arr[0]+suffix[i]);
            }
            System.out.println(ans);
        }
    }
}
