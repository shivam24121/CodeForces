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
            
            st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            long x=Long.parseLong(st.nextToken());
            long y=Long.parseLong(st.nextToken());
            
            if(y<n){
                System.out.println("-1");
                return;
            }
            long last=x-(n-1);
            if(last*last*1L+(n-1)<x){
                System.out.println("-1");
                return;
            }
            System.out.println(last);
            for(int i=0;i<n-1;i++){
                System.out.println(1);
            }
        }
    }
}
