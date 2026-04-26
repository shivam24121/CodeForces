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
            String a=br.readLine();
            String b=br.readLine();
            
            int[] dp=new int[n+1];
            Arrays.fill(dp,-1);
            
            System.out.println(solve(0,a,b,dp));
        }
    }
    public static int solve(int idx,String a,String b,int[] dp){
        
        if(idx==a.length()){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int vertical=solve(idx+1,a,b,dp)+((a.charAt(idx)!=b.charAt(idx))?1:0);
        int horizontal=Integer.MAX_VALUE;
        if(idx+1<a.length()){
            horizontal=solve(idx+2,a,b,dp)+((a.charAt(idx)!=a.charAt(idx+1))?1:0)+((b.charAt(idx)!=b.charAt(idx+1))?1:0);
        }
        return dp[idx]=Math.min(vertical,horizontal);
    }
}
