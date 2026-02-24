import java.util.*;
import java.io.*;
public class StringMatch {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(br.readLine());
        String s=br.readLine();
        boolean fl=true;
        if(s.length()<k){
            fl=false;
        }
        System.out.println(solve(s,k)-solve(s,k-1));
    }
    public static long solve(String s,int k){
        int l=0;
        long one=0;
        long res=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(c=='1')one++;
            while(one>k && l<=r){
                if(s.charAt(l)=='1'){
                    one--;
                }
                l++;
            }
            if(one<=k){
                res+=((long)r-l+1);
            }
        }
        return res;
    }
}

