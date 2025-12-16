import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String s=br.readLine();
            int r=0,ss=0;
            int n=s.length();
            int ans=0;
            
            for(int i=0;i<n;i++){
                char c=s.charAt(i);
                if(c=='('){
                    r++;
                }
                if(c=='['){
                    ss++;
                }
                if(c==')'){
                    if(r>0){
                        ans++;
                        r--;
                    }
                }
                if(c==']'){
                    if(ss>0){
                        ans++;
                        ss--;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
