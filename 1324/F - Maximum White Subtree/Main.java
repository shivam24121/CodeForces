import java.util.*;
import java.io.*;

public class WhiteTree {

    static int[] state;
    static ArrayList<ArrayList<Integer>>adj;
    static int[] res;

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        state=new int[n+1];
        for(int i=1;i<=n;i++){
            state[i]=Integer.parseInt(st.nextToken());
        }
        adj=new ArrayList<>();
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
        res=new int[n+1];
        dfs1(1,-1);

        dfs2(1,-1);

        for(int i=1;i<=n;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void dfs1(int u,int parent){
        res[u]=state[u]==1?1:-1;

        for(int neigh:adj.get(u)){
            if(neigh==parent)continue;
            dfs1(neigh,u);
            if(res[neigh]>0){
                res[u]+=res[neigh];
            }
        }
    }
    public static void dfs2(int u,int parent){
        for(int neigh:adj.get(u)){
            if(neigh==parent)continue;
            int increment=Math.max(0,res[u]-Math.max(0,res[neigh]));
            res[neigh]+=increment;
            dfs2(neigh,u);
//            System.out.println(neigh+" "+res[neigh]+" "+res[u]);
        }
    }
}
