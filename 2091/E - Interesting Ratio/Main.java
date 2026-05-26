import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    
    public static ArrayList<Integer> sieve(int n){
        
        boolean[] prime=new boolean[n+1];
        Arrays.fill(prime,true);
        
        prime[0]=prime[1]=false;
        
        ArrayList<Integer>res=new ArrayList<>();
        
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]){
                res.add(i);
            }
        }
        return res;
    }
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=Integer.parseInt(br.readLine());
        ArrayList<Integer>prime=sieve((int)1e7+10);
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            
            long res=0;
            
            for(int p:prime){
                if(n/p==0)break;
                res+=(n/p);
            }
            
            System.out.println(res);
        }
    }
}
