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
           int x=Integer.parseInt(st.nextToken());
           int y=Integer.parseInt(st.nextToken());
           int z=Integer.parseInt(st.nextToken());
           
           int together=x+y;
           
           int option1=(n+together-1)/together;
           int option2=z;
           int rem=n-(z*x);
           if(rem>0){
               option2+=(rem+(x+(10*y))-1)/(x+(10*y));
           }
            System.out.println(Math.min(option2,option1));
        }
    }
}
