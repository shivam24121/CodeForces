import java.util.*;
import java.io.*;
public class Main{
    static String base="ROYGBIV";
    static String extra="GBIV";
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        sb.append(base);
        for(int i=0;i<n-7;i++){
            sb.append(extra.charAt(i%4));
        }
        System.out.println(sb.toString());
    }
}
