import java.util.*;
import java.io.*;

public class IdiotTraversal {
    static int mod=(int)1e9+7;
    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());
        while(t-->0){

            int n=Integer.parseInt(br.readLine());

            ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

            for(int i=0;i<=n;i++){
                adj.add(new ArrayList<>());
            }

            adj.get(0).add(1);
            adj.get(1).add(0);

            StringTokenizer st;

            for(int i=1;i<=n;i++){

                st=new StringTokenizer(br.readLine());

                int l=Integer.parseInt(st.nextToken());
                int r=Integer.parseInt(st.nextToken());

                adj.get(i).add(l);
                adj.get(l).add(i);

                adj.get(i).add(r);
                adj.get(r).add(i);
            }
            int[] subTree=new int[n+1];
            boolean[] vis=new boolean[n+1];

            dfs1(0,-1,adj,subTree,vis);

            for(int i=0;i<=n;i++){
                subTree[i]--;
            }

//            for(int i=0;i<=n;i++){
//                System.out.print(subTree[i]+" ");
//            }

            int[] ans=new int[n+1];

            ans[0]=0;
            Arrays.fill(vis,false);
            vis[0]=true;

            dfs2(1,0,adj,vis,ans,subTree);

            for(int i=1;i<=n;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
    public static void dfs1(int u,int parent,ArrayList<ArrayList<Integer>>adj,int[] subTree,boolean[] vis){

        subTree[u]=1;
        vis[u]=true;

        for(int neigh:adj.get(u)){
            if(neigh==parent)continue;

            if(!vis[neigh]){
                dfs1(neigh,u,adj,subTree,vis);
                subTree[u]+=subTree[neigh];
            }
        }
    }
    public static void dfs2(int u,int parent,ArrayList<ArrayList<Integer>>adj,boolean[] vis,int[] ans,int[] subTree){

        vis[u]=true;

        ans[u]=(int)(1+ans[parent]+(subTree[u]*2L))%mod;

        for(int neigh:adj.get(u)){

            if(neigh==parent)continue;
            if(!vis[neigh]){
                dfs2(neigh,u,adj,vis,ans,subTree);
            }
        }
    }
}

