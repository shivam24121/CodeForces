import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int n=Integer.parseInt(s,2);
        
        int ct=0;
        while(n>1){
            if(n%2==1){
                n++;
                ct++;
            }
            else{
                n=n/2;
                ct++;
            }
        }
        System.out.println(ct);
    }
}
