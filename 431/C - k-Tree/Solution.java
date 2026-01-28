import java.util.*;
import java.io.*;
public class kTree {
    static int mod=(int)1e9+7;
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(st.nextToken());


        long[][] dp=new long[101][101];
        for(int i=0;i<=100;i++){
            Arrays.fill(dp[i],-1);
        }
        long ans=(solve(dp,n,k)-solve(dp,n,d-1)+mod)%mod;
        System.out.println(ans);
    }
    public static long solve(long[][]dp,int n,int k){
        if(n==0)return 1;
        if(n<0)return 0;

        if(dp[n][k]!=-1)return dp[n][k];

        long res=0;
        for(int i=1;i<=k;i++){
            res=(res+solve(dp,n-i,k))%mod;
        }
        return dp[n][k]=res;
    }
}
