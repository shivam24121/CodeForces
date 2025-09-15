import java.util.*;
import java.util.stream.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        System.out.println(solve(s)?"YES":"NO");
    }
    public static boolean solve(String s){
        if(s.length()<5){
            return false;
        }
        String target="hello";
        int j=0;
        for(int i=0;i<s.length() && j<target.length();i++){
            if(s.charAt(i)==target.charAt(j)){
                j++;
            }
        }
        return j==target.length();
    }
}
