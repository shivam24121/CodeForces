import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            String s=br.readLine();
            int ct=0;
            for(int i=0;i<n;i++){
                ct++;
                if(s.charAt(i)=='L'){
                    break;
                }
            }
            System.out.println(ct);
        }
    }
}
