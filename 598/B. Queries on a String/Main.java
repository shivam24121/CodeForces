import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int l=Integer.parseInt(st.nextToken())-1;
            int r=Integer.parseInt(st.nextToken())-1;
            int k=Integer.parseInt(st.nextToken());
            
            int len=r-l+1;
            k=k%len;
            if(k==0)continue;
            
            String temp=s.substring(l,r+1);
            String res=temp.substring(len-k)+temp.substring(0,len-k);
            s=s.substring(0,l)+res+s.substring(r+1);
        }
        System.out.println(s);
    }
}
