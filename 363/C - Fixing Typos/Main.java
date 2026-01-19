import java.util.*;
import java.io.*;
public class Typos {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int len=sb.length();
            
            if(len>=2 && c==sb.charAt(len-1) && c==sb.charAt(len-2)){
                continue;
            }
            if(len>=3 && c==sb.charAt(len-1) && sb.charAt(len-2)==sb.charAt(len-3)){
                continue;
            }
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
