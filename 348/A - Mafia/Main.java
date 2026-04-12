import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=1;
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            
            int[] arr=new int[n];
            long sum=0;
            
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
                sum+=arr[i];
            }
            
            long l=3;
            long r=sum+n+1;
            
            long ans=Long.MAX_VALUE;
            
            while(l<=r){
                long mid=l+(r-l)/2;
                if(valid(arr,mid)){
                    ans=mid;
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            
            System.out.println(ans);
        }
    }
    public static boolean valid(int[] arr,long mid){
        
        int n=arr.length;
        long rest=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]>mid){
                return false;
            }
            rest+=(mid-arr[i]);
        }
        return rest>=mid;
    }
}
