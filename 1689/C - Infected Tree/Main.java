import java.util.*;
import java.io.*;

public class TreeInfection {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

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
            int[] subTree=new int[n+1];
            child(1,0,subTree,adj);

//            for(int i=1;i<=n;i++){
//                System.out.print(subTree[i]+" ");
//            }
//            System.out.println();
            if(adj.get(1).size()==1){
                System.out.println(subTree[adj.get(1).get(0)]);
                continue;
            }

            int[] dp=new int[n+1];
            Arrays.fill(dp,-1);

            int leftCut=dfs(1,adj.get(1).get(0),adj.get(1).get(1),adj,subTree,dp);
            int rightCut=dfs(1,adj.get(1).get(1),adj.get(1).get(0),adj,subTree,dp);

            int ans=Math.max(leftCut,rightCut);
            System.out.println(ans);
        }
    }
    public static void child(int u,int parent,int[] subTree,ArrayList<ArrayList<Integer>>adj){
        for(int neigh:adj.get(u)){
            if(neigh==parent)continue;

            child(neigh,u,subTree,adj);
            subTree[u]+=subTree[neigh]+1;
        }
    }
    public static int dfs(int parent,int cut,int infected,ArrayList<ArrayList<Integer>>adj,int[] subTree,int[] dp){
        if(dp[cut]!=-1){
            return dp[cut];
        }
        int saved=subTree[cut];

        ArrayList<Integer>currChild=new ArrayList<>();
        for(int neigh:adj.get(infected)){
            if(neigh==parent)continue;
            currChild.add(neigh);
        }
        if(currChild.isEmpty()){
            dp[cut]=saved+0;
        }
        else if(currChild.size()==1){
            dp[cut]=saved+subTree[currChild.get(0)];
        }
        else{
            int left=dfs(infected,currChild.get(0),currChild.get(1),adj,subTree,dp);
            int right=dfs(infected,currChild.get(1),currChild.get(0),adj,subTree,dp);

            dp[cut]=saved+Math.max(left,right);
        }
        return dp[cut];
    }
}
