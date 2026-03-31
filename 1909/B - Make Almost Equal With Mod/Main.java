import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            
            long[] arr=new long[n];
            long ans=0;
            
            for(int i=0;i<n;i++){
                arr[i]=Long.parseLong(st.nextToken());
            }
            
            for(int x=1;x<=60;x++){
                long mask=(1L<<x);
                Set<Long>set=new HashSet<>();
                
                for(int i=0;i<n;i++){
                    set.add(arr[i]%mask);
                }
                if(set.size()==2){
                    ans=mask;
                    continue;
                }
            }
            System.out.println(ans);
        }
    }
    
}
