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
            
            long u=Long.parseLong(st.nextToken());
            long v=Long.parseLong(st.nextToken());
            
            long x=(v-u)/2;
            
            if((u>v) || (v-u)%2!=0){
                System.out.println("-1");
            } 
            
            else if(u==0 && v==0){
                System.out.println("0");
            }
            
            else if(u==v){
                System.out.println(1);
                System.out.println(u);
            }
            
            else if((u&x)==0){
                System.out.println(2);
                System.out.println((u+x)+" "+x);
            }
            else{
                System.out.println(3);
                System.out.println(x+" "+x+" "+u);
            }
        }
    }
}
