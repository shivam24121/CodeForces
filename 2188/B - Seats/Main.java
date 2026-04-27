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
            
            int nn=Integer.parseInt(br.readLine());
            String s=br.readLine();
            int res=0;
            int ct=0;
            
            char[] arr=s.toCharArray();
            
            // System.out.println(n==arr.length?"YES":"NO");
            int n=arr.length;
            
            if(n>=2 && arr[0]=='0' && arr[1]=='0'){
                arr[1]='1';
            }
            if(n>=2 && arr[n-1]=='0' && arr[n-2]=='0'){
                arr[n-2]='1';
            }
            
            for(char c:arr){
                if(c=='0'){
                    ct++;
                    if(ct==3){
                        res++;
                        ct=0;
                    }
                }
                else{
                    res++;
                    ct=0;
                }
            }
            System.out.println(n==1?1:res);
        }
    }
}
