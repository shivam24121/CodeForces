import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            
            if(k>n){
                System.out.println("-1");
                continue;
            }
            
            Map<Integer,Integer>map=new HashMap<>();
            
            int ans=solve(0,n,k,map);
            System.out.println(ans==Integer.MAX_VALUE/2?"-1":ans);
        }
    }
    public static int solve(int ct,int n,int k,Map<Integer,Integer>map){
        if(n<k)return Integer.MAX_VALUE/2;
        if(n==k)return ct;
        
        if(map.get(n)!=null)return map.get(n);
        
        int floor=n/2;
        int ceil=n-floor;
        
        int l=solve(ct+1,floor,k,map);
        int r=solve(ct+1,ceil,k,map);
        
        map.put(n,Math.min(l,r));
        return Math.min(l,r);
    }
}
