import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
        String s2=br.readLine();
        
        Map<Character,Integer>map=new HashMap<>();
        
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(c==' ')continue;
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        boolean possible=true;
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            if(c==' ')continue;
            if(!map.containsKey(c) || map.get(c)==0){
                possible=false;
                break;
            }
            map.put(c,map.getOrDefault(c,0)-1);
        }
        System.out.println(possible?"YES":"NO");
    }
}
