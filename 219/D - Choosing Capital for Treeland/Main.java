import java.io.*;
import java.util.*;

public class Capital {

    static ArrayList<ArrayList<int[]>>adj;
    static int[] res;
    static boolean[] visited;

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        res=new int[n+1];
        visited=new boolean[n+1];

        StringTokenizer st;
        for(int i=1;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());

            adj.get(u).add(new int[]{v,0});
            adj.get(v).add(new int[]{u,1});
        }
        res[1]=dfs1(1);
        //System.out.println(res[1]);

        Arrays.fill(visited,false);

        dfs2(1);

        int min=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            min=Math.min(min,res[i]);
        }

        System.out.println(min);
        for(int i=1;i<=n;i++){
            if(res[i]==min){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static int dfs1(int u){
        visited[u]=true;
        int cost=0;

        for(int[] neigh:adj.get(u)){
            int v=neigh[0];
            int w=neigh[1];
            if(visited[v])continue;
            cost+=w+dfs1(v);
        }
        return cost;
    }
    public static void dfs2(int u){
        visited[u]=true;

        for(int[] neigh:adj.get(u)){
            int v=neigh[0];
            int w=neigh[1];
            if(visited[v])continue;

            //System.out.println(v+" "+w+" "+u);

            res[v]=res[u]+(w==1?-1:1);

            //System.out.println(v+": "+res[v]);

            dfs2(v);
        }
    }
}
