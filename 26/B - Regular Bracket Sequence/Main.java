import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int open=0,pair=0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                open++;
            }
            else if(c==')'){
                if(open>0){
                    open--;
                    pair++;
                }
            }
        }
        System.out.println(pair*2);
    }
}
