import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    
    static int[][] dp;
    static int n;
    static int[] arr;
    
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=1;
        while(t-->0){
            
            n=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            
            arr=new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            dp=new int[n+1][2];
            
            dp[n][0]=Integer.MIN_VALUE/10;
            dp[n][1]=0;
            
            for(int i=n-1;i>=0;i--){
                for(int j=0;j<2;j++){
                    
                    int odd=Math.abs(arr[i])%2;
                    int next=j^odd;
                    
                    int pick=arr[i]+dp[i+1][next];
                    int skip=dp[i+1][j];
                    
                    dp[i][j]=Math.max(pick,skip);
                }
            }
            
            System.out.println(dp[0][0]);
        }
    }
}
