import java.util.*;
import java.io.*;

public class FixedPoints {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());

            int[] a=new int[n+1];
            int[][] dp=new int[n+1][n+1];

            st=new StringTokenizer(br.readLine());
            for(int i=1;i<=n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }

            for(int i=1;i<=n;i++){
                dp[i][0]=dp[i-1][0]+(a[i]==i?1:0);
                for(int j=1;j<=i;j++){
                    dp[i][j]=dp[i-1][j-1];

                    if(a[i]==i-j){
                        dp[i][j]=Math.max(dp[i][j],dp[i-1][j]+1);
                    }
                    else{
                        dp[i][j]=Math.max(dp[i][j],dp[i-1][j]);
                    }
                }
            }
            int ans=-1;
            for(int i=0;i<=n;i++){
                if(dp[n][i]>=k){
                    ans=i;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
