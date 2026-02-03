import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        long k=Long.parseLong(st.nextToken());
        
        int[] a=new int[n];
        
        st=new StringTokenizer(br.readLine());
        
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        
        long ct=-1,coins=-1;
        
        long l=0;
        long r=n;
        
        while(l<=r){
            long mid=l+(r-l)/2;
            if(cost(a,mid)<=k){
                ct=mid;
                coins=cost(a,mid);
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        System.out.println(ct+" "+coins);
    }
    public static long cost(int[] a,long k){
        long coins=0;
        long[] b=new long[a.length];
        
        for(int i=0;i<a.length;i++){
            b[i]=a[i]+(long)(i+1)*k;;
        }
        Arrays.sort(b);

        for(int i=0;i<k;i++){
            coins+=b[i];
        }
        return coins;
    }
}
