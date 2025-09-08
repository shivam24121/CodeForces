import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int n=s.length();
        int qCt=0,leftQ=0;
        
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='Q'){
                qCt++;
            }
        }
        
        int res=0;
        
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='Q'){
                leftQ++;
            }
            else if(c=='A'){
                int rightQ=qCt-leftQ;
                res+=leftQ*rightQ;
            }
        }
        System.out.println(res);
    }
}
