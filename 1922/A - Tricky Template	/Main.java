import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            String a=br.readLine();
            String b=br.readLine();
            String c=br.readLine();
            
            boolean fl=false;
            for(int i=0;i<n;i++){
                if(c.charAt(i)!=a.charAt(i) && c.charAt(i)!=b.charAt(i)){
                    fl=true;
                    break;
                }
            }
            System.out.println(fl?"YES":"NO");
        }
    }
}
