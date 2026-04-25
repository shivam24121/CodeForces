import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=1;
        while(t-->0){
    
            st=new StringTokenizer(br.readLine());
            
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            
            int[] arr=new int[n];
            
            st=new StringTokenizer(br.readLine());
            
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            
            if(n>m){
                System.out.println("0");
                return;
            }
            long ans=1;
            
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    long diff=Math.abs(arr[i]-arr[j]);
                    ans=(ans*(diff%m))%m;
                }
            }
            
            System.out.println(ans);
        }
    }
}
