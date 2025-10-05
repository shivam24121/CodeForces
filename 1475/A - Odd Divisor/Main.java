import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            long n=Long.parseLong(br.readLine());
            System.out.println(solve(n)?"NO":"YES");
        }
    }
    public static boolean solve(long n){
        return (n&(n-1))==0;
    }
}
