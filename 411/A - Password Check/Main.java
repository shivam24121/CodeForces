import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        boolean length=false,upper=false,lower=false,digit=false,special=false;
        
        if(s.length()>=5){
            length=true;
        }
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLowerCase(c)){
                lower=true;
            }
            else if(Character.isUpperCase(c)){
                upper=true;
            }
            else if(Character.isDigit(c)){
                digit=true;
            }
            else{
                special=true;
            }
        }
        System.out.println((length&&lower&&upper&&digit)?"Correct":"Too weak");
    }
}
