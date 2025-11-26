import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int res=n/5;
        int rem=n%5;
        System.out.println(res+(rem==0?0:1));
    }
}
