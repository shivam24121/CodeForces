import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String s=br.readLine();
            int ct=0;
            for(char c:s.toCharArray()){
                if(c=='Y')ct++;
            }
            System.out.println(ct>1?"NO":"YES");
        }
    }
}
