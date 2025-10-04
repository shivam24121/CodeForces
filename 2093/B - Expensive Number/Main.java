import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String s=br.readLine();
            System.out.println(solve(s));
        }
    }
    public static int solve(String s){
        int n=s.length();
        int zero=0;
        int idx=-1;
        for(int i=n-1;i>=0;i--){
            char c=s.charAt(i);
            if(c!='0'){
                idx=i;
                break;
            }
            else{
                zero++;
            }
        }
        int ct=0;
        for(int i=idx-1;i>=0;i--){
            char c=s.charAt(i);
            if(c!='0'){
                ct++;
            }
        }
        return zero+ct;
    }
}
