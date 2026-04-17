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
            
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            boolean[] fl=new boolean[3002];
            
            for(int i:arr){
                fl[i]=true;
            }
            for(int i=1;i<=n;i++){
                if(!fl[i]){
                    System.out.println(i);
                    return;
                }
            }
            // System.out.println(ans);
        }
    }
}
