import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    
    static int[] parent;
    static int[] size;
    static int[] min;
    
    public static void dsu(int n){
        parent=new int[n+1];
        size=new int[n+1];
        min=new int[n+1];
        
        for(int i=1;i<=n;i++){
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
        
        if(u==v){
            min[u]=Math.min(min[u],min[v]);
            min[v]=Math.min(min[u],min[v]);
        }
        if(size[u]>=size[v]){
            parent[v]=u;
            size[u]+=size[v];
            min[u]=Math.min(min[u],min[v]);
        }
        else{
            parent[u]=v;
            size[v]+=size[u];
            min[v]=Math.min(min[u],min[v]);
        }
    }
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=1;
        while(t-->0){
            
            st=new StringTokenizer(br.readLine());
            
            int n=Integer.parseInt(st.nextToken());
            int e=Integer.parseInt(st.nextToken());
            
            dsu(n);
            
            long res=0;
            
            st=new StringTokenizer(br.readLine());
            
            for(int i=1;i<=n;i++){
                min[i]=Integer.parseInt(st.nextToken());
            }
            
            for(int i=0;i<e;i++){
                st=new StringTokenizer(br.readLine());
                int u=Integer.parseInt(st.nextToken());
                int v=Integer.parseInt(st.nextToken());
                
                union(u,v);
            }
            for(int i=1;i<=n;i++){
                if(i==parent[i]){
                    res+=min[i];
                }
            }
            
            System.out.println(res);
        }
    }
}
