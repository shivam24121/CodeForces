import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            long sum=0,max=0;
            long res=0;
            for(int i=1;i<=n;i++){
                max=Math.max(max,-1L*i*i+i+sum);
                int x=Integer.parseInt(st.nextToken());
                sum+=x;
                res=Math.max(res,1L*i*i+i-sum+max);
            }
            System.out.println(sum+res);
        }
    }
}
/*
        (r-l+1)*(r+l)     == new 
        -(pref(r)-pref(l-1)) == old
        
        r2-rl+r +rl-l2+l   rl kata
        
        r2+r    -l2+l
        
        isme add prefix term 
        
        r2+r-pref[r]   -l2+l+pref[l-1];

*/
