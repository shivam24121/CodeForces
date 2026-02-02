import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited=new boolean[n+1];
        ArrayList<Integer>res=new ArrayList<>();
        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(1);
        visited[1]=true;
        
        
        while(!pq.isEmpty()){
            int curr=pq.poll();
            res.add(curr);
            
            for(int neigh:adj.get(curr)){
                if(!visited[neigh]){
                    visited[neigh]=true;
                    pq.offer(neigh);
                }
            }
        }
        for(int i:res){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
