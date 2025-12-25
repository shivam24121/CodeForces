import java.util.*;
import java.io.*;

public class LCA_TREE {

    static ArrayList<ArrayList<Integer>> adj;
    static int[] depth;
    static boolean[] visited;
    static int[] ans;
    static int k,n;

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){

            StringTokenizer st=new StringTokenizer(br.readLine());
            n=Integer.parseInt(st.nextToken());
            k=Integer.parseInt(st.nextToken());
            adj=new ArrayList<>();

            for(int i=0;i<=n;i++){
                adj.add(new ArrayList<>());
            }
            for(int i=0;i<n-1;i++){
                st=new StringTokenizer(br.readLine());
                int u=Integer.parseInt(st.nextToken());
                int v=Integer.parseInt(st.nextToken());
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            depth=new int[n+1];
            visited=new boolean[n+1];
            ans=new int[n+1];
            dfs1(1,-1);

//            for(int i=0;i<=n;i++){
//                System.out.print(depth[i]+" ");
//                System.out.println();
//                System.out.print(visited[i]+" ");
//            }
            int first=0;
            long res=0;

            for(int i=1;i<n+1;i++){
                first+=(depth[i]>=k)?1:0;
            }
            ans[1]=first;
            Arrays.fill(visited,false);
            dfs2(1);

            for(int i=1;i<=n;i++){
                res+=ans[i];
            }
            System.out.println(res);
        }
    }
    public static void dfs1(int u,int parent){
        depth[u]=1;
        visited[u]=true;

        for(int neigh:adj.get(u)){
            if(neigh==parent)continue;

            if(!visited[neigh]){
                dfs1(neigh,u);
                depth[u]+=depth[neigh];
            }
        }
    }
    public static void dfs2(int u){
        visited[u]=true;

        for(int neigh:adj.get(u)){
            if(visited[neigh])continue;
            int x=depth[neigh];
            int diff=0;
            if(n-x<k)diff--;
            if(x<k)diff++;
            ans[neigh]=ans[u]+diff;
            dfs2(neigh);
        }
    }
}
