import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a=br.readLine();
        String b=br.readLine();
        
        int x=0,y=0;
        for(int i=0;i<a.length();i++){
            char first=a.charAt(i);
            char sec=b.charAt(i);
            if(first=='4' && sec=='7')x++;
            if(first=='7' && sec=='4')y++;
        }
        System.out.println(Math.max(x,y));
    }
}
