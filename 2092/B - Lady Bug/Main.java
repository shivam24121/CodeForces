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
            
            String a=br.readLine();
            String b=br.readLine();
            
            int ct0=0;
            int ct1=0;
            
            for(int i=0;i<n;i++){
                if(i%2==0){
                    if(a.charAt(i)=='0')ct0++;
                    if(b.charAt(i)=='0')ct1++;
                }
                else{
                    if(b.charAt(i)=='0')ct0++;
                    if(a.charAt(i)=='0')ct1++;
                }
            }
            System.out.println((ct0>=(n+1)/2 && ct1>=n/2)?"YES":"NO");
        }
    }
}
