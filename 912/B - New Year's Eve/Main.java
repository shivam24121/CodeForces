import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        long n=Long.parseLong(st.nextToken());
        long k=Long.parseLong(st.nextToken());
        
        if(k==1){
            System.out.println(n);
            return;
        }
        int ct=0;
        long temp=n;
        while(temp>0){
            ct++;
            temp>>=1;
        }
        long sum=(1L<<ct)-1;
        System.out.println(sum);
    }
}
