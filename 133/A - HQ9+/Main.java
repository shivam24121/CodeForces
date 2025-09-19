import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='H' || c=='Q' || c=='9'){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
