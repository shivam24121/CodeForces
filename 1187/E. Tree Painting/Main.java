import java.io.*;
import java.util.*;

public class Tree_Paint {

    static ArrayList<ArrayList<Integer>>adj;
    static boolean[] visited;
    static long[] subTree;
    static long[] res;
    static int n;

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());

        adj=new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        StringTokenizer st;
        for(int i=1;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        visited=new boolean[n+1];
        subTree=new long[n+1];
        res=new long[n+1];

        dfs1(1,-1);

        Arrays.fill(visited,false);

        for(int i=1;i<=n;i++){
            res[1]+=subTree[i];
        }

        dfs2(1,-1);

//
//        for(int i=1;i<=n;i++){
//            System.out.print(subTree[i]+" ");
//        }
//        System.out.println();
//
//        for(int i=1;i<=n;i++){
//            System.out.print(res[i]+" ");
//        }
        long ans=0;
        for(int i=1;i<=n;i++){
            if(res[i]>ans){
                ans=res[i];
            }
        }
        System.out.println(ans);
    }
    public static void dfs1(int u,int parent){
        visited[u]=true;
        subTree[u]=1;

        for(int neigh:adj.get(u)){
            if(neigh==parent)continue;

            if(!visited[neigh]){
                dfs1(neigh,u);
                subTree[u]+=subTree[neigh];
            }
        }
    }
    public static void dfs2(int u,int parent){
        visited[u]=true;

        for(int neigh:adj.get(u)){
            if(neigh==parent)continue;

            if(!visited[neigh]){
                res[neigh]=res[u]+(n-subTree[neigh])-subTree[neigh];
                dfs2(neigh,u);
            }
        }
    }
}
 
