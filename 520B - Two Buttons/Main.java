import java.util.*;
import java.io.*;

public class Button {
    static class Pair{
        int val;
        int steps;
        Pair(int v,int s){
            this.val=v;
            this.steps=s;
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        if(m<n){
            System.out.println(n-m);
            return;
        }
        if(m==n){
            System.out.println(0);
            return;
        }
        Queue<Pair>q=new LinkedList<>();
        int max=m*2;
        boolean[] visited=new boolean[max];

        q.offer(new Pair(n,0));
        visited[n]=true;

        while(!q.isEmpty()){
            Pair curr=q.poll();
            int v=curr.val;
            int s=curr.steps;

            if(v==m){
                System.out.println(s);
                return;
            }
            else{
                if(v*2<max && !visited[v*2]){
                    q.offer(new Pair(v*2,s+1));
                    visited[v*2]=true;
                }
                if((v-1)>0 && !visited[v-1]){
                    q.offer(new Pair(v-1,s+1));
                }
            }
        }
        System.out.println("-1");
    }
}
