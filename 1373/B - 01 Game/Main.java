import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String s=br.readLine();
            int one=0,zero=0;
            for(int i=0;i<s.length();i++){
              char c=s.charAt(i);
              if(c=='1')one++;
              else zero++;
            }
            int move=Math.min(one,zero);
            System.out.println(move%2==1?"DA":"NET");
        }
    }
}
