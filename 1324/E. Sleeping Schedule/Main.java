import java.util.*;
import java.io.*;
public class Sleep {
    static int[][] dp;

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());
        int l=Integer.parseInt(st.nextToken());
        int r=Integer.parseInt(st.nextToken());

        dp=new int[n+1][h+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        int[] a=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        int res=solve(0,0,a,h,l,r);
        System.out.println(res);
//        for(int i=0;i<=n;i++){
//            for(int j=0;j<=h;j++) System.out.print(dp[i][j]+" ");
//            System.out.println();
//        }
    }
    public static int solve(int idx,int curr,int[] a,int h,int l,int r){
        int res=0;

        if(curr>=l && curr<=r&&idx>0){
            res++;
        }
        if(idx>=a.length)return res;
        if(dp[idx][curr]!=-1)return dp[idx][curr];

        int sleep1=res+solve(idx+1,((a[idx]-1+h)+curr)%h,a,h,l,r);
        int sleep2=res+solve(idx+1,(a[idx]+curr)%h,a,h,l,r);

        return dp[idx][curr]=Math.max(sleep1,sleep2);
    }
}
