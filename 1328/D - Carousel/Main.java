import java.util.*;
import java.io.*;

public class Carousel {
    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){

            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());

            int[] a=new int[n];
            Map<Integer,ArrayList<Integer>>adj=new HashMap<>();

            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            Map<Integer,Integer>link=new HashMap<>();
            int idx=0;
            for(int x:a){
                if(!link.containsKey(x)){
                    link.put(x,idx++);
                }
            }
            boolean[] visited=new boolean[idx];
            int[] color=new int[idx];
            Arrays.fill(color,-1);

            for(int i=1;i<n;i++){
                int u=link.get(a[i]);
                int v=link.get(a[i-1]);

                if(u!=v){

                    adj.putIfAbsent(u,new ArrayList<>());
                    adj.putIfAbsent(v,new ArrayList<>());
                    adj.get(u).add(v);
                    adj.get(v).add(u);
                }
            }
            if(a[0]!=a[n-1]){
                int u=link.get(a[0]);
                int v=link.get(a[n-1]);
                adj.putIfAbsent(u,new ArrayList<>());
                adj.putIfAbsent(v,new ArrayList<>());
                adj.get(u).add(v);
                adj.get(v).add(u);

            }
            for(int i=0;i<idx;i++){
                if(!visited[i]){
                    color[i]=1;
                    dfs(i,color,visited,adj);
                }
            }
            int max=1;
            for(int i=0;i<n;i++){
                max=Math.max(max,color[link.get(a[i])]);
            }
            System.out.println(max);
            for(int i=0;i<n;i++){
                System.out.print(color[link.get(a[i])]+" ");
            }
            System.out.println();
        }
    }
    public static void dfs(int u,int[] color,boolean[] visited,Map<Integer,ArrayList<Integer>>adj){
        visited[u]=true;

        for(int neigh:adj.getOrDefault(u,new ArrayList<>())){
            if(color[neigh]==color[u]){
                color[neigh]=3;
                continue;
            }
            if(!visited[neigh]){
                if(color[u]==1)color[neigh]=2;
                else if(color[u]==2)color[neigh]=1;
                else color[neigh]=1;
                dfs(neigh,color,visited,adj);
            }
        }
    }
}
