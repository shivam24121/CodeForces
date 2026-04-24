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
            
            long x=Long.parseLong(st.nextToken());
            long y=Long.parseLong(st.nextToken());
            
            System.out.println((y/x)>2?"YES":"NO");
        }
    }
}
