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
            String s=br.readLine();
            
            int ct=0;
            
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='H'){
                    ct++;
                }
            }
            int res=Integer.MAX_VALUE;
            
            int tiger=0;
            
            for(int i=0;i<ct;i++){
                if(s.charAt(i)=='T'){
                    tiger++;
                }
            }
            res=Math.min(res,tiger);
            
            for(int i=ct;i<s.length();i++){
                if(s.charAt(i)=='T'){
                    tiger++;
                }
                if(s.charAt(i-ct)=='T'){
                    tiger--;
                }
                res=Math.min(res,tiger);
            }
            for(int i=0;i<ct;i++){
                if(s.charAt((n+i-ct)%n)=='T'){
                    tiger--;
                }
                if(s.charAt((n+i)%n)=='T'){
                    tiger++;
                }
                res=Math.min(res,tiger);
            }
            
            System.out.println(res);
        }
    }
}
