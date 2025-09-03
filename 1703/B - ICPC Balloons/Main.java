import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            String s=br.readLine();
            Set<Character> set=new HashSet<>();
            for(int i=0;i<n;i++){
                char c=s.charAt(i);
                set.add(c);
            }
            int second=n-set.size();
            System.out.println((set.size()*2)+second);
        }
    }
}
