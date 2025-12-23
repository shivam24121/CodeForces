import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s=new StringBuilder(br.readLine());

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                for(int j=0;j<26;j++){
                    char c=(char)(j+'a');
                    if(c!=s.charAt(i-1) && (i+1==s.length() || c!=s.charAt(i+1))){
                        s.setCharAt(i,c);
                        break;
                    }
                }
            }
        }
        System.out.println(s.toString());
    }
}
