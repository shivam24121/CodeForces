import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
            StringBuilder sb=new StringBuilder();
            
            for(int i=1;i<=n;i++){
                int x=Integer.parseInt(st.nextToken());
                pq.add(new int[]{i,x});
            }
            int ct=0;
            
            while(true){
                
                if(pq.size()<=1)break; 
                
                int[] a=pq.poll();
                int[] b=pq.poll();
                
                if(b[1]<=0)break;
                
                ct++;
                
                sb.append(a[0]+" "+b[0]).append("\n");
                
                a[1]--;
                b[1]--;
                
                pq.offer(a);
                if(b[1]>0){
                    pq.offer(b);
                }
            }
            System.out.println(ct);
            System.out.print(sb.toString());
        }
    }
}
