import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            String s=br.readLine();
            boolean fl=true;
            Set<Character>set=new HashSet<>();
            int i=0;
            while(i<n){
                char c=s.charAt(i);
                if(set.contains(c)){
                    fl=false;
                    break;
                }
                set.add(c);
                while(i<n && s.charAt(i)==c)i++;
            }
            System.out.println(fl?"YES":"NO");
            
        }
    }
}
