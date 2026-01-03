import java.util.*;
import java.io.*;

public class Book {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
            for(int i=0;i<=n;i++){
                adj.add(new ArrayList<>());
            }
            int[] inDegree=new int[n+1];
            StringTokenizer st;
            for(int i=1;i<=n;i++){
                st=new StringTokenizer(br.readLine());
                int num=Integer.parseInt(st.nextToken());
                while(num-->0){
                    int x=Integer.parseInt(st.nextToken());
                    adj.get(x).add(i);
                    inDegree[i]++;
                }
            }
//            for(int i=0;i<=n;i++){
//                System.out.println(i+": "+inDegree[i]);
//            }
            int[] time=new int[n+1];
            Arrays.fill(time,-1);

            Queue<Integer>q=new LinkedList<>();
            for(int i=1;i<=n;i++){
                if(inDegree[i]==0){
                    q.offer(i);
                    time[i]=0;
                }
            }

            int ct=0;
            int res=0;

            while(!q.isEmpty()){
                int u=q.poll();
                ct++;
                for(int neigh:adj.get(u)){
                    if(neigh>=u){
                        time[neigh]=Math.max(time[neigh],time[u]);
                    }
                    else{
                        time[neigh]=Math.max(time[neigh],1+time[u]);
                    }
                    inDegree[neigh]--;
                    if(inDegree[neigh]==0){
                        q.offer(neigh);
                    }
                }
                res=Math.max(res,time[u]);
            }
//            for(int i=0;i<n;i++){
//                System.out.print(i+1+":: "+time[i+1]+" ");
//            }
//            System.out.println();

            System.out.println(ct==n?res+1:-1);
        }
    }
}
