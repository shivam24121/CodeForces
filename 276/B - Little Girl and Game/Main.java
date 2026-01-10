import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int n=s.length();
        
        int[] freq=new int[26];
        for(int i=0;i<n;i++){
            int x=s.charAt(i)-'a';
            freq[x]++;
        }
        int odd=0;
        for(int i=0;i<26;i++){
            if(freq[i]%2==1){
                odd++;
            }
        }
        System.out.println(odd<=1?"First":odd%2==0?"Second":"First");
    }
}
