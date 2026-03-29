import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        long curr=0;
        
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
            curr+=(a[i]*a[i]);
        }
        
        long res=curr;
        
        int[] create=new int[n];
        
        for(int x=20;x>=0;x--){
            int mask=(1<<x);
            int one=0;
            for(int i=0;i<n;i++){
                if((mask&a[i])!=0){
                    one++;
                }
            }
            for(int i=0;i<one;i++){
                create[i]|=mask;
            }
        }
        curr=0;
        for(long i:create){
            curr+=(i*i);
        }
        res=Math.max(res,curr);
        System.out.println(curr);
    }
}
