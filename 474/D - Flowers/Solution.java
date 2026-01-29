import java.util.*;
import java.io.*;
public class Book{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int t=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        int mod=(int)1e9+7;

        int max=100005;

        int[][] edges=new int[t][2];
        for(int i=0;i<t;i++){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());

            edges[i][0]=u;
            edges[i][1]=v;

        }

        int[] dp=new int[max];
        dp[0]=1;

        for(int i=1;i<max;i++){
            dp[i]=dp[i-1];
            if(i>=k){
                dp[i]=(dp[i]+dp[i-k])%mod;
            }
        }
//        for(int i=0;i<=max;i++){
//            System.out.print(dp[i]+" ");
//        }
//        System.out.println();
        long[] prefix=new long[max+2];
        prefix[0]=dp[0];
        for(int i=1;i<max;i++){
            prefix[i]=(prefix[i-1]+dp[i])%mod;
        }

        StringBuilder sb=new StringBuilder();
        for(int[] e:edges){
            int l=e[0];
            int r=e[1];

            long temp=((prefix[r]-prefix[l-1])+mod)%mod;
            sb.append(temp+" ").append("\n");
        }
        System.out.println(sb.toString());
    }
}
