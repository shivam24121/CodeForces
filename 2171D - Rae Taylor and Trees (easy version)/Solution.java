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
            
            int[] arr=new int[n+1];
            
            int[] prefix=new int[n+1];
            int[] suffix=new int[n+2];
            
            for(int i=1;i<=n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            prefix[1]=arr[1];
            
            for(int i=2;i<=n;i++){
                prefix[i]=Math.min(prefix[i-1],arr[i]);
            }
            
            suffix[n]=arr[n];
            
            for(int i=n-1;i>=1;i--){
                suffix[i]=Math.max(suffix[i+1],arr[i]);
            }
            boolean fl=true;
            
            for(int i=2;i<=n;i++){
                if(prefix[i-1]>suffix[i]){
                    fl=false;
                    break;
                }
            }
            
            System.out.println(fl?"YES":"NO");
        }
    }
}
