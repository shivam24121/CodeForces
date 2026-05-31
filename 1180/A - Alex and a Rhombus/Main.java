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
            
            int n=Integer.parseInt(br.readLine());
            
            int[] dp=new int[n+2];
            
            dp[1]=1;
            dp[2]=5;
            
            int fact=8;
            
            for(int i=3;i<=n;i++){
                dp[i]=dp[i-1]+fact;
                fact+=4;
            }
            System.out.println(dp[n]);
        }
    }
}
