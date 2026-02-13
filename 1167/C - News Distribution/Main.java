import java.util.*;
public class Main{
    
    static int[] parent;
    static int[] size;
    
    public static void dsu(int n){
        parent=new int[n+1];
        size=new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    public static int find(int u){
        if(parent[u]!=u){
            parent[u]=find(parent[u]);
        }
        return parent[u];
    }
    public static void union(int u,int v){
        u=find(u);
        v=find(v);
        
        if(u==v)return;
        
        if(size[u]<size[v]){
            size[v]+=size[u];
            parent[u]=v;
        }
        else{
            size[u]+=size[v];
            parent[v]=u;
        }
    }
    
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        
        dsu(n);
        
        for(int i=0;i<m;i++){

            int total=obj.nextInt();
            
            if(total==0)continue;
            
            int u=obj.nextInt();
            
            for(int j=1;j<total;j++){
                int v=obj.nextInt();
                union(u,v);
            }
        }
        for(int i=1;i<=n;i++){
            System.out.print(size[find(i)]+" ");
        }
        System.out.println();
    }
}
