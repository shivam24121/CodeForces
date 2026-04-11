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
            
            st=new StringTokenizer(br.readLine());
            
            int n=Integer.parseInt(st.nextToken());
            int l=Integer.parseInt(st.nextToken());
            int r=Integer.parseInt(st.nextToken());
            
            int[] arr=new int[n+1];
            
            for(int i=1;i<=n;i++){
                arr[i]=i;
                if(i==r){
                    arr[i]=arr[l-1];
                }
            }
            for(int i=1;i<=n;i++){
                System.out.print((arr[i]^arr[i-1])+" ");
            }
            System.out.println();
        }
    }
}
