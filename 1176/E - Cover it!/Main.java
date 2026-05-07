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
            
            st=new StringTokenizer(br.readLine());
            
            int n=Integer.parseInt(st.nextToken());
            int e=Integer.parseInt(st.nextToken());
            
            ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
            for(int i=0;i<=n;i++){
                adj.add(new ArrayList<>());
            }
            boolean[] vis=new boolean[n+1];
            ArrayList<Integer>one=new ArrayList<>();
            ArrayList<Integer>zero=new ArrayList<>();
            
            for(int i=0;i<e;i++){
                st=new StringTokenizer(br.readLine());
                int u=Integer.parseInt(st.nextToken());
                int v=Integer.parseInt(st.nextToken());
                
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            dfs(1,0,vis,adj,one,zero);
            
            if(one.size()<=n/2){
                System.out.println(one.size());
                for(int i:one){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            else{
                System.out.println(zero.size());
                for(int i:zero){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }
    public static void dfs(int curr,int color,boolean[] vis,ArrayList<ArrayList<Integer>>adj,ArrayList<Integer>one,ArrayList<Integer>zero){
        
        vis[curr]=true;
        if(color==0){
            zero.add(curr);
        }
        else{
            one.add(curr);
        }
        for(int neigh:adj.get(curr)){
            if(!vis[neigh]){
                dfs(neigh,1-color,vis,adj,one,zero);
            }
        }
    }
}
