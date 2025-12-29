import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            long k=Long.parseLong(br.readLine());
            long x=sq(k);
            System.out.println(k+x);
        }
    }
    public static long sq(long x){
        long l=1,r=(long)1e9;
        long ans=0;
        
        while(l<=r){
            long mid=l+(r-l)/2;
            if(mid<=x/mid){
                ans=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return ans*ans<x?ans+1:ans;
    }
}
