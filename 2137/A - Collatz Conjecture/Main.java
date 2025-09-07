import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            long k=Long.parseLong(st.nextToken());
            long x=Long.parseLong(st.nextToken());
            System.out.println(solve(k,x));
        }
    }
    public static long solve(long k,long x){
        for(long i=0;i<k;i++){
            boolean fl=(((x&1)==0) && ((x-1)%3==0));
            if(fl){
                long a=(x-1)/3;
                if(a%2!=0){
                    x=a;
                }
                else{
                    x=2*x;
                }
            }
            else{
                x=x*2;
            }
        }
        return x;
    }
}
