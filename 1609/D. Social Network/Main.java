import java.util.*;
import java.io.*;

public class SocialNetwork {

    static int[] parent;
    static int[] size;

    static void DSU(int n){
        parent=new int[n+1];
        size=new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    static int find(int u){
        if(parent[u]!=u){
            parent[u]=find(parent[u]);
        }
        return parent[u];
    }
    static void union(int u,int v){
        u=find(u);
        v=find(v);

        if(u==v)return;

        if(size[u]<size[v]){
            parent[u]=v;
            size[v]+=size[u];
        }
        else{
            parent[v]=u;
            size[u]+=size[v];
        }
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int q=Integer.parseInt(st.nextToken());

        DSU(n);
        StringBuilder sb=new StringBuilder();
        int extra=0;

        while(q-->0){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());

            u=find(u);
            v=find(v);

            if(u==v){
                extra++;
            }
            else{
                union(u,v);
            }
            int ans=0;

//            int[] temp=Arrays.copyOf(size,size.length);
//            Arrays.sort(temp);
//            reverse(temp);
//
//            int ans=0;
//            for(int i=0;i<extra;i++){
//                ans+=temp[i];
//            }

            ArrayList<Integer>component=new ArrayList<>();
            for(int i=1;i<=n;i++){
                if(i==parent[i]){
                    component.add(size[i]);
                }
            }
            Collections.sort(component,Collections.reverseOrder());
            for(int i=0;i<Math.min(extra+1,component.size());i++){
                ans+=component.get(i);
            }
            ans--;
            sb.append(ans).append("\n");
        }
        System.out.println(sb.toString());
    }
    public static void reverse(int[] a){
        for(int i=0;i<a.length/2;i++){
            int temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
    }
}
