import java.io.*;
import java.util.*;

public class Tree_MaxCost {

    static int[] cost;
    static ArrayList<ArrayList<Integer>>adj;
    static long[] ans;
    static int[] subCost;
    static long total;
    static int n;

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        cost=new int[n+1];
        for(int i=1;i<=n;i++){
            cost[i]=Integer.parseInt(st.nextToken());
            total+=cost[i];
        }
        adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        ans=new long[n+1];
        subCost=new int[n+1];

        for(int i=1;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        dfs1(1,-1,0);
        dfs2(1,-1);

        long res=0;
        for(long i:ans){
            res=Math.max(i,res);
        }
        System.out.println(res);
    }
    public static void dfs1(int u,int parent,int depth){
        subCost[u]=cost[u];
        ans[1]+=depth*(long)subCost[u];

        for(int neigh:adj.get(u)){
            if(parent==neigh)continue;
            dfs1(neigh,u,depth+1);
            subCost[u]+=subCost[neigh];
        }
    }
    public static void dfs2(int u,int parent){
        for(int neigh:adj.get(u)){
            if(neigh==parent)continue;
            ans[neigh]=ans[u]+(total-subCost[neigh])-subCost[neigh];
            dfs2(neigh,u);
        }
    }
}
