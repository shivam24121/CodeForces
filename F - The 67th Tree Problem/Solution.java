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
            
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            
            int n=x+y;
            
            if(n==0 || y<x || ((n%2==0) && x==0)){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            ArrayList<String>res=new ArrayList<>();
            
            int line=n%2==0?x-1:x;
            int ct=0;
            int val=2+line;
            
            for(int i=1;i<=line;i++){
                res.add((i)+" "+(i+1));
            }
            for(int i=2;i<=line+1;i++){
                res.add(i+" "+(val++));
            }
            while(val<=n){
                res.add("1 "+(val++));
            }
            for(int i=0;i<res.size();i++){
                System.out.println(res.get(i));
            }
        }
    }
}
