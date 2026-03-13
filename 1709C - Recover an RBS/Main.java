import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String s=br.readLine();
            System.out.println(solve(s)?"YES":"NO");
        }
    }
    public static boolean solve(String s){
        int n=s.length();
        int open=n/2;
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                open--;
            }
        }
        int openLast=-1;
        int closeFirst=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='?' && open>0){
                openLast=i;
                sb.setCharAt(i,'(');
                open--;
            }
            else if(s.charAt(i)=='?'){
                closeFirst=closeFirst==-1?i:closeFirst;
                sb.setCharAt(i,'(');
            }
        }
        if(openLast==-1 || closeFirst==-1){
            return true;
        }
        
        sb.setCharAt(openLast,')');
        sb.setCharAt(closeFirst,'(');
        int ct=0;
        for(int i=0;i<n;i++){
            if(sb.charAt(i)=='('){
                ct++;
            }
            else{
                ct--;
                if(ct<0){
                    return true;
                }
            }
        }
        return false;
    }
}
