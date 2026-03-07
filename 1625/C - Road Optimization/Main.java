import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int l=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        
        st=new StringTokenizer(br.readLine());
        int[] stop=new int[n+1];
        for(int i=0;i<n;i++){
            stop[i]=Integer.parseInt(st.nextToken());
        }
        stop[n]=l;
        
        st=new StringTokenizer(br.readLine());
        int[] val=new int[n];
        for(int i=0;i<n;i++){
            val[i]=Integer.parseInt(st.nextToken());
        }
        long[][] dp=new long[n+2][k+2];
        for(long[] e: dp){
            Arrays.fill(e,-1);
        }
        System.out.println(solve(n,l,k,stop,val,dp,0));
    }
    public static long solve(int n,int l,int k,int[] stop,int[] val,long[][] dp,int idx){
        
        if(idx>=n)return 0;
        
        if(dp[idx][k]!=-1)return dp[idx][k];
        
        long ans=Integer.MAX_VALUE;
        
        for(int i=0;i<=k;i++){
            if(idx+i>=n)break;
            long sum=(stop[idx+i+1]-stop[idx])*(long)val[idx];
            ans=Math.min(ans,sum+solve(n,l,k-i,stop,val,dp,idx+i+1));
        }
        dp[idx][k]=ans;
        return dp[idx][k];
    }
}




