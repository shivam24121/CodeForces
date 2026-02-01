import java.util.*;
import java.io.*;

public class Main{
    
    static class knight{
        int idx;
        int pow;
        long coin;
        knight(int idx,int pow,long coin){
            this.idx=idx;
            this.pow=pow;
            this.coin=coin;
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        
        int[] power=new int[n];
        long[] coins=new long[n];
        
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            power[i]=Integer.parseInt(st.nextToken());
        }
        
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            coins[i]=Long.parseLong(st.nextToken());
        }
        
        knight[] arr=new knight[n];
        
        for(int i=0;i<n;i++){
            arr[i]=new knight(i,power[i],coins[i]);
        }
        
        Arrays.sort(arr,(a,b)->a.pow-b.pow);
        PriorityQueue<Long>pq=new PriorityQueue<>();
        long[] res=new long[n];
        long sum=0;
        
        for(int i=0;i<n;i++){
            
            res[arr[i].idx]=arr[i].coin+sum;
            
            sum+=arr[i].coin;
            pq.offer(arr[i].coin);
            
            if(pq.size()>k){
                sum-=pq.poll();
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
