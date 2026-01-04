import java.util.*;
import java.io.*;

public class Policia {

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int p=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(st.nextToken());

        Queue<Integer>q=new LinkedList<>();
        boolean[] visited=new boolean[n+1];

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<p;i++){
            int x=Integer.parseInt(st.nextToken());
            q.offer(x);
            visited[x]=true;
        }
        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=1;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            adj.get(u).add(new int[]{v,i});
            adj.get(v).add(new int[]{u,i});
        }
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n-1;i++){
            set.add(i+1);
        }
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int[] neigh:adj.get(curr)){
                if(!visited[neigh[0]]){
                    set.remove(neigh[1]);
                    visited[neigh[0]]=true;
                    q.offer(neigh[0]);
                }
            }
        }
        System.out.println(set.size());
        for(int i:set){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
