import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String s=br.readLine();
            int ct=0;
            String cf="codeforces";
            for(int i=0;i<10;i++){
                if(s.charAt(i)!=cf.charAt(i))ct++;
            }
            System.out.println(ct);
        }
    }
}
