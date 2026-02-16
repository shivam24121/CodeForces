import java.util.*;
import java.io.*;
public class Main{
    static int[] par;
    static int[] sz;
    static int[] ed;
    public static void dsu(int n){
        par=new int[n+1];
        sz=new int[n+1];
        ed=new int[n+1];
        for(int i=0;i<=n;i++){
            par[i]=i;
            sz[i]=1;
            ed[i]=0;
        }
    }
    public static int find(int u){
        if(u!=par[u]){
            par[u]=find(par[u]);
        }
        return par[u];
    }
    public static void union(int u,int v){
        u=find(u);
        v=find(v);
        if(u==v){
            ed[u]++;
            return;
        }
        if(sz[u]>sz[v]){
            par[v]=u;
            sz[u]+=sz[v];
            ed[u]+=ed[v]+1;
        }
        else{
            par[u]=v;
            sz[v]+=sz[u];
            ed[v]+=ed[u]+1;
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        dsu(n);
        boolean fl=true;
        for(int i=0;i<m;i++){
          st=new StringTokenizer(br.readLine());
          int u=Integer.parseInt(st.nextToken());
          int v=Integer.parseInt(st.nextToken());
          union(u,v);
        }
        for(int i=1;i<=n;i++){
            if(par[i]==i){
                long exp=(long)sz[i]*(long)(sz[i]-1)/2;
                if(exp!=ed[i]){
                    fl=false;
                    break;
                }
            }
        }
        System.out.println(fl?"YES":"NO");
    }
}
