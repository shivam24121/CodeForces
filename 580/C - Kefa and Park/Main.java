import java.util.*;
import java.io.*;
public class Main{
    static class Pair{
        int n;
        int state;
        Pair(int n,int p){
            this.n=n;
            this.state=p;
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int[] a=new int[n+1];
        st=new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        int[][] edges=new int[n-1][2];
        for(int i=0;i<n-1;i++){
            st=new StringTokenizer(br.readLine());
            edges[i][0]=Integer.parseInt(st.nextToken());
            edges[i][1]=Integer.parseInt(st.nextToken());
        }
        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            int uu=a[u];
            int vv=a[v];
            adj.get(u).add(new Pair(v,vv));
            adj.get(v).add(new Pair(u,uu));
        }
        int count=0;

        count+=solve(1,adj,m,a[1]==1?1:0,-1);
        System.out.println(count);

    }
    public static int solve(int curr,ArrayList<ArrayList<Pair>>adj,int m,int ct,int parent){
        // System.out.println(ct+" "+curr);
        if(ct>m)return 0;
        int res=0;
        for(Pair neigh:adj.get(curr)){
            int next=neigh.n;
            //if(next==parent)continue;
            int nextState=ct;
            int status=neigh.state;
            if(status==0){
              nextState=0;
            }
            else{
              nextState=ct+status;
            }
            
            // if(curr == 5) {
            //   System.out.println(nextState+" "+curr);
            // }
            if(adj.get(curr).size()==1 && ct<=m && next==parent){
                res++;
            }
            else if (next != parent) {
              res+=solve(next,adj,m,nextState,curr);
            }
        }
        return res;
    }
}
