import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st;
            ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
            for(int i=0;i<=n;i++){
                adj.add(new ArrayList<>());
            }
            var map=new HashMap<String,Integer>();
            
            map.put(-1+"_"+1,0);
            map.put(-1+"_"+1,0);
            
            for(int i=1;i<n;i++){
                st=new StringTokenizer(br.readLine());
                int u=Integer.parseInt(st.nextToken());
                int v=Integer.parseInt(st.nextToken());
                
                adj.get(u).add(v);
                adj.get(v).add(u);
                
                map.put(u+"_"+v,i);
                map.put(v+"_"+u,i);
            }
            
            int[] dp=new int[n+1];
            dp[1]=1;
            
            dfs(1,-1,adj,map,dp);
            
            int ans=1;
            for(int i:dp){
                ans=Math.max(i,ans);
            }
            System.out.println(ans);
        }
    }
    public static void dfs(int curr,int parent,ArrayList<ArrayList<Integer>> adj,HashMap<String,Integer>map,int[] dp){
        for(int neigh:adj.get(curr)){
            if(neigh==parent)continue;
            
            if(map.get(parent+"_"+curr)<map.get(curr+"_"+neigh)){
                dp[neigh]=dp[curr];
            }
            else{
                dp[neigh]=dp[curr]+1;
            }
            dfs(neigh,curr,adj,map,dp);
        }
    }
}
