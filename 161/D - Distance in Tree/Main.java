import java.io.*;
import java.util.*;

public class TreeDist {

    static ArrayList<ArrayList<Integer>>adj;
    static int[][] dp;
    static long res;
    static int k;

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());

        adj=new ArrayList<>();
        dp=new int[n+1][k+1];

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=1;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        dfs(1,0);

        System.out.println(res);
    }
    public static void dfs(int u,int parent){
        dp[u][0]=1;

        for(int neigh:adj.get(u)){
            if(neigh==parent)continue;
            dfs(neigh,u);

            for(int i=1;i<=k;i++){
                res+=(long)dp[neigh][i-1]*dp[u][k-i];
            }
            for(int i=1;i<=k;i++){
                dp[u][i]+=dp[neigh][i-1];
            }
        }
    }
}
