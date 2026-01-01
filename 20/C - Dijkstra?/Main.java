import java.util.*;
import java.io.*;

public class Dijkstra {
    public static void main(String[] args)throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int e=Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
        int[] dist=new int[n+1];
        int[] parent=new int[n+1];

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<e;i++){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            int w=Integer.parseInt(st.nextToken());

            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{1,0});
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[1]=0;
        parent[1]=0;

        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int currNode=curr[0];
            int currDist=curr[1];

            if(currDist>dist[currNode])continue;

            for(int[] neigh:adj.get(currNode)){
                int nextNode=neigh[0];
                int nextDist=neigh[1];

                if(dist[currNode]+nextDist<dist[nextNode]){
                    dist[nextNode]=dist[currNode]+nextDist;
                    pq.offer(new int[]{nextNode,dist[nextNode]});
                    parent[nextNode]=currNode;
                }
            }
        }
        if(dist[n]==Integer.MAX_VALUE){
            System.out.println("-1");
            return;
        }
        ArrayList<Integer>res=new ArrayList<>();
        res.add(n);
        int x=n;

        while(parent[x]!=0){
            int temp=parent[x];
            res.add(temp);
            x=temp;
        }
        Collections.reverse(res);

        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
        System.out.println();
    }
}
