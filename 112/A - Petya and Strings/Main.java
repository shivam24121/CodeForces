import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
        String s2=br.readLine();
        int a=s1.compareToIgnoreCase(s2);
        if(a<0){
            System.out.println(-1);
        }
        else if(a>0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
