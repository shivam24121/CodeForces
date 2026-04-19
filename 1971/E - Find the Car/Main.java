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
            
            int[] arr=new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            long[][] dp=new long[n][2];
            for(long[] a:dp){
                Arrays.fill(a,-1);
            }
            System.out.println(solve(0,0,arr,dp));
        }
    }
    public static long solve(int idx,int next,int[] arr,long[][] dp){
        
        if(idx==arr.length){
            return 0L;
        }
        if(dp[idx][next]!=-1){
            return dp[idx][next];
        }
        int val=next==0?arr[idx]:-arr[idx];
        
        long pick=Integer.MIN_VALUE;
        if(idx<=arr.length-2){
            pick=Math.max(pick,-val+solve(idx+1,1,arr,dp));
        }
        long skip=val+solve(idx+1,0,arr,dp);
        
        return dp[idx][next]=Math.max(pick,skip);
    }
}
