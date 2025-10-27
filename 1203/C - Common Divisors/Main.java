import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        long[] a=new long[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Long.parseLong(st.nextToken());
        }
        long g=a[0];
        for(int i=1;i<n;i++){
            g=gcd(g,a[i]);
        }
        System.out.println(div(g));
        
    }
    public static long gcd(long a, long b){
        return b==0?a:gcd(b,a%b);
    }
    public static int div(long n){
        int ct=0;
        for(long i=1;i*i<=n;i++){
            if(n%i==0){
                ct++;
                if(i!=n/i)ct++;
            }
        }
        return ct;
    }
}
