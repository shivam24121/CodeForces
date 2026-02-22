import java.util.*;
import java.io.*;
public class Main{
    static int[] parent;
    static int[] size;
    public static void dsu(int n){
        parent=new int[2*n+1];
        size=new int[2*n+1];
        for(int i=1;i<2*n+1;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    public static int find(int u){
        if(u!=parent[u]){
            parent[u]=find(parent[u]);
        }
        return parent[u];
    }
    public static void union(int u,int v){
        u=find(u);
        v=find(v);
        if(u==v)return;
        if(size[u]>size[v]){
            parent[v]=u;
            size[u]+=size[v];
        }
        else{
            parent[u]=v;
            size[v]+=size[u];
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int[] indegree=new int[n+1];
            int[][] edges=new int[n][2];
            StringTokenizer st;
            boolean fl=true;
            for(int i=0;i<n;i++){
                st=new StringTokenizer(br.readLine());
                int u=Integer.parseInt(st.nextToken());
                int v=Integer.parseInt(st.nextToken());
                edges[i][0]=u;
                edges[i][1]=v;
                indegree[u]++;
                indegree[v]++;
                if(indegree[u]>2 || indegree[v]>2){
                    fl=false;
                    break;
                }
            }
            dsu(n);
            for(int i=0;i<n;i++){
                int u=edges[i][0];
                int v=edges[i][1];
                if(find(u)==find(v))fl=false;
                union(u,n+v);
                union(n+u,v);
            }
            System.out.println(fl?"YES":"NO");
        }
    }
}
