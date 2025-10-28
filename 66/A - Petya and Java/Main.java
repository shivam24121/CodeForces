import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BigInteger n=new BigInteger(br.readLine());
        if(n.compareTo(BigInteger.valueOf(127))<=0){
            System.out.println("byte");
        }
        else if(n.compareTo(BigInteger.valueOf(32767))<=0){
            System.out.println("short");
        }
        else if(n.compareTo(BigInteger.valueOf(2147483647))<=0){
            System.out.println("int");
        }
        else if(n.compareTo(BigInteger.valueOf(9223372036854775807L))<=0){
            System.out.println("long");
        }
        else{
            System.out.println("BigInteger");
        }
    }
}
