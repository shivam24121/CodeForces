import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a=br.readLine();
        String b=br.readLine();
        System.out.println(solve(a,b));
    }
    public static int solve(String a,String b){
        int n=a.length()-1;
        int m=b.length()-1;
        
        int res=0;
        while(n>=0 && m>=0 && a.charAt(n)==b.charAt(m)){
            m--;
            n--;
        }
        return n+m+2;
    }
}
