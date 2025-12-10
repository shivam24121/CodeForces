import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n=Integer.parseInt(br.readLine());
        int[][] edges=new int[n-1][2];
        for(int i=0;i<n-1;i++){
            st=new StringTokenizer(br.readLine());
            edges[i][0]=Integer.parseInt(st.nextToken());
            edges[i][1]=Integer.parseInt(st.nextToken());
        }
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited=new boolean[n+1];
        st=new StringTokenizer(br.readLine());
        ArrayList<Integer>bfs=new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=Integer.parseInt(st.nextToken());
            bfs.add(x);
        }
        if(bfs.get(0)!=1){
            System.out.println("NO");
            return;
        }
        int idx=1;
        Queue<Integer>q=new LinkedList<>();
        q.offer(bfs.get(0));
        visited[bfs.get(0)]=true;
        
        while(!q.isEmpty()){
            int curr=q.poll();
            ArrayList<Integer>temp=new ArrayList<>();
            for(int neigh:adj.get(curr)){
                if(!visited[neigh]){
                    temp.add(neigh);
                }
            }
            int ct=temp.size();
            Set<Integer>set=new HashSet<>();
            for(int i=0;i<ct;i++){
                set.add(temp.get(i));
            }
            for(int i=0;i<ct;i++){
                if(idx>n || !set.contains(bfs.get(idx))){
                    System.out.println("NO");
                    return;
                }
                idx++;
            }
            for(int i=idx-ct;i<idx;i++){
                q.offer(bfs.get(i));
                visited[bfs.get(i)]=true;
            }
        }
        System.out.println("YES");
    }
}
