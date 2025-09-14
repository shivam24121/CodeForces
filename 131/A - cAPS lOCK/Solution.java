import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        if(s.length()==1 && Character.isLowerCase(s.charAt(0))){
            System.out.println(s.toUpperCase());
            return;
        }
        else if(s.length()==1 && Character.isUpperCase(s.charAt(0))){
            System.out.println(s.toLowerCase());
            return;
        }
        else if(upper(s)){
            System.out.println(s.toLowerCase());
        }
        else if(Character.isLowerCase(s.charAt(0)) && upper(s.substring(1))){
            System.out.println(s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase());
        }
        else{
            System.out.println(s);
        }
    }
    public static boolean upper(String s){
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
}
