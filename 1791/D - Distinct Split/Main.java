import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            String s=br.readLine();
            int len=s.length();
            Set<Character> set1=new HashSet<>();
            Set<Character> set2=new HashSet<>();
            int[] a=new int[len];
            int[] b=new int[len];
            for(int i=0;i<n;i++){
                char c=s.charAt(i);
                set1.add(c);
                a[i]=set1.size();
            }
            for(int i=len-1;i>=0;i--){
                char c=s.charAt(i);
                set2.add(c);
                b[i]=set2.size();
            }
            
            int max=IntStream.range(0,len-1)
            .map(i->a[i]+b[i+1])
            .max()
            .getAsInt();
            
            System.out.println(max);
        }
        
    }
    
}
