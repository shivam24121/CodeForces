import java.util.*;
import java.io.*;
public class BeautifulGraph {
    static int mod=998244353;

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int edg=Integer.parseInt(st.nextToken());

            ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
            for(int i=0;i<=n;i++){
                adj.add(new ArrayList<>());
            }
            int[][] edges=new int[edg][2];
            for(int i=0;i<edg;i++){
                st=new StringTokenizer(br.readLine());
                int u=Integer.parseInt(st.nextToken());
                int v=Integer.parseInt(st.nextToken());
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            long res=1;
            int[] color=new int[n+1];
            Arrays.fill(color,-1);
            boolean fl=true;

            for(int i=1;i<n+1;i++) {
                if (color[i] != -1) continue;

                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                color[i] = 0;

                long c0 =1,c1=0;
                while(!q.isEmpty()) {
                    int curr = q.poll();
                    for(int neigh:adj.get(curr)) {
                        if(color[neigh]==-1) {
                            int col=color[curr] ^ 1;
                            color[neigh]=col;
                            if (col==0) c0++;
                            else c1++;
                            q.add(neigh);
                        } else if(color[curr]==color[neigh]) {
                            fl = false;
                            break;
                        }
                    }
                    if (!fl) {
                        break;
                    }
                }
                if (!fl) {
                    res = 0;
                    break;
                }
                res =(res*(pow(c0)+pow(c1)))% mod;
            }
            System.out.println(res);
        }
    }
    public static long pow(long x) {
        long base=2,res=1;
        while(x>0){
            if(x%2==1){
                res=(res*base)%mod;
            }
            base=(base*base)%mod;
            x=x/2;
        }
        return res;
    }
}
