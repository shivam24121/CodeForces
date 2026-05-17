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
            
            float res=0;
            
            for(int i=0;i<n;i++){
                res+=Float.parseFloat(st.nextToken());
            }
            
            System.out.println(res/n);
        }
    }
}
