import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int ct4=map.getOrDefault('4',0);
        int ct7=map.getOrDefault('7',0);
        
        if(ct4==0 && ct7==0){
            System.out.println("-1");
        }
        else if(ct4>=ct7){
            System.out.println("4");
        }
        else {
            System.out.println("7");
        }
    }
}
