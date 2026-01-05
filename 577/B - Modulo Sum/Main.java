import java.util.*;
import java.io.*;

public class ModuloSum {

    static int n,m;
    static int[][] dp;
    static int[] a;

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());

        if(n>m){
            System.out.println("YES");
            return;
        }

        st=new StringTokenizer(br.readLine());
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken())%m;
            if(a[i]==0){
                System.out.println("YES");
                return;
            }
        }
        dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        boolean fl=false;
        for(int i=0;i<n;i++){
            if(solve(i+1,a[i])){
                fl=true;
                break;
            }
        }
        System.out.println(fl?"YES":"NO");
    }
    public static boolean solve(int idx,int mod){
        if(idx==n)return mod==0;

        if(dp[idx][mod]!=-1){
            return dp[idx][mod]==1;
        }
        //pick
        if(solve(idx+1,(a[idx]+mod)%m)){
            dp[idx][mod]=1;
            return true;
        }
        if(solve(idx+1,mod)){
            dp[idx][mod]=1;
            return true;
        }
        dp[idx][mod]=0;
        return false;
    }
}
