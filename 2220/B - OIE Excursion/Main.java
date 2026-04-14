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
            int k=Integer.parseInt(st.nextToken());
            
            st=new StringTokenizer(br.readLine());
            
            int[] arr=new int[n];
            boolean fl=true;
            
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            int curr=1;
            
            for(int i=1;i<n;i++){
                if(arr[i]==arr[i-1]){
                    curr++;
                    if(curr>=k){
                        fl=false;
                        break;
                    }
                }
                else{
                    curr=1;
                }
            }
            
            System.out.println(fl?"YES":"NO");
        }
    }
}
