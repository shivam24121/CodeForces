import java.util.*;
import java.io.*;
public class Main{
    static String keyBoard="qwertyuiopasdfghjkl;zxcvbnm,./";

    public static void main(String[] atgs)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char dir=br.readLine().charAt(0);
        String s=br.readLine();
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int idx=keyBoard.indexOf(c);
            if(dir=='R'){
                sb.append(keyBoard.charAt(idx-1));
            }
            else{
                sb.append(keyBoard.charAt(idx+1));
            }
        }
        System.out.println(sb.toString());
    }
}
