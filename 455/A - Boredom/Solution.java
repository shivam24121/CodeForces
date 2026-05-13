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
            
            st=new StringTokenizer(br.readLine());
            int[] arr=new int[n];
            int max=0;
            
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
                max=Math.max(arr[i],max);
            }
            int[] freq=new int[max+1];
            
            for(int i:arr){
                freq[i]++;
            }
            
            long[] dp=new long[max+1];
            Arrays.fill(dp,-1);
            
            System.out.println(solve(1,freq,dp));
        }
    }
    public static long solve(int idx,int[] freq,long[] dp){
        
        if(idx>=freq.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        long pick=idx*freq[idx]+solve(idx+2,freq,dp);
        
        long skip=solve(idx+1,freq,dp);
        
        return dp[idx]=Math.max(pick,skip);
    }
}
