import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=Long.parseLong(st.nextToken());
            }
            long k=0;
            long sum=0;
            for(int i=0;i<n;i++){
                long temp=k+a[i];
                sum+=a[i];
                k=Math.max(Math.abs(sum),Math.abs(temp));
            }
            System.out.println(k);
        }
    }
}
