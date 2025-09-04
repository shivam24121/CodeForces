import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int ct=0;
        //1,5,10,20,100;
        
        ct+=n/100;
        n%=100;
        
        ct+=n/20;
        n%=20;
        
        ct+=n/10;
        n%=10;
        
        ct+=n/5;
        n%=5;
        
        ct+=n;
      
        System.out.println(ct);
    }
}
