import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            
            int[] arr=new int[n];
            int ct=0;
            
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
                if(i>0 && Math.abs(arr[i]-arr[i-1])==gcd(arr[i],arr[i-1])){
                    ct++;
                }
            }
            
            System.out.println(ct);
        }
    }
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}
