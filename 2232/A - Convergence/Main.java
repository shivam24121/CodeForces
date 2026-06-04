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
            
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            
            int ans=0;
            
            for(int i=0;i<n/2;i++){
                if(arr[i]!=arr[n-i-1]){
                    ans++;
                }
            }
            
            System.out.println(ans);
        }
    }
}
