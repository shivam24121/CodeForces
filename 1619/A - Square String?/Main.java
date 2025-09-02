import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String s=br.readLine();
            int n=s.length();
            if(n%2!=0){
                System.out.println("NO");
            }
            else{
                String s1=s.substring(0,n/2);
                String s2=s.substring(n/2,n);
                if(s1.equals(s2)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
