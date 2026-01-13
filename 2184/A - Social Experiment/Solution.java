import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            if(n<=3){
                System.out.println(n);
            }
            else{
                System.out.println((n&1)==1?1:0);
            }
        }
    }
}
