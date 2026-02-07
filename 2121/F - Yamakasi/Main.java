import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            long s=Long.parseLong(st.nextToken());
            long x=Long.parseLong(st.nextToken());
            
            st=new StringTokenizer(br.readLine());
            long[] a=new long[n];
            
            for(int i=0;i<n;i++){
                a[i]=Long.parseLong(st.nextToken());
            }
            System.out.println(solve(a,n,s,x)-solve(a,n,s,x-1));
        }
    }
    public static long solve(long[] a,long n,long s,long x){
        long curr=0;
        long res=0;
        Map<Long,Long>map=new HashMap<>();
        map.put(0l,1l);
        
        for(int i=0;i<n;i++){
            curr+=a[i];
            if(a[i]>x){
                map.clear();
                curr=0;
            }
            
            res+=map.getOrDefault(curr-s,0l);
            map.put(curr,map.getOrDefault(curr,0l)+1);
        }
        return res;
    }
}
