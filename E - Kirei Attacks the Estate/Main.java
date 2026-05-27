import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            
            int[] arr=new int[n+1];
            
            for(int i=1;i<=n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
            
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
            boolean[] vis=new boolean[n+1];
            // vis[1]=true;
            
            long[] ans=new long[n+1];
            ans[1]=arr[1];
            
            dfs(1,0,adj,vis,ans,arr);
            
            for(int i=1;i<=n;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
    public static void dfs(int u,int p,ArrayList<ArrayList<Integer>>adj,boolean[] vis,long[] ans,int[] arr){
        
        vis[u]=true;
        
        ans[u]=Math.max(ans[u],arr[u]);
        
        for(int neigh:adj.get(u)){
            
            if(vis[neigh])continue;
            
            ans[neigh]=Math.max(arr[neigh],arr[neigh]+ans[p]-arr[u]);
            
            dfs(neigh,u,adj,vis,ans,arr);
        }
    }
}
