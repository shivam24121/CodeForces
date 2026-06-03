import java.util.*;
import java.io.*;

public class Theft{
    static long inf=(long)1e17;
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n=Integer.parseInt(br.readLine());
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<1;j++){
                arr[i][0]=Integer.parseInt(st.nextToken());
                arr[i][1]=Integer.parseInt(st.nextToken());
            }
        }
        long[][] dp=new long[n+1][n+1];
        for(long[] a:dp){
            Arrays.fill(a,-1);
        }
        System.out.println(solve(0,0,arr,dp));
    }
    public static long solve(int idx,int cover,int[][] arr,long[][] dp){

        if(cover>=arr.length){
            return 0;
        }
        if(idx==arr.length){
            return inf;
        }
        if(dp[idx][cover]!=-1){
            return dp[idx][cover];
        }
        long skip=solve(idx+1,cover,arr,dp);
        long pick=arr[idx][1]+solve(idx+1,1+cover+arr[idx][0],arr,dp);

        return dp[idx][cover]=Math.min(skip,pick);
    }
}
