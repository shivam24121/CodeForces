import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            String s=br.readLine();
            int curr=0;
            
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='a')curr++;
                else curr--;
            }
            int prefix=0;
            int res=n;
            Map<Integer,Integer>map=new HashMap<>();
            map.put(0,-1);
            
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='a')prefix++;
                else{
                    prefix--;
                }
                map.put(prefix,i);
                
                int rem=prefix-curr;
                if(map.containsKey(rem)){
                    int index=map.get(rem);
                    int len=i-index;
                    res=Math.min(res,len);
                }
            }
            System.out.println(res==n?-1:res);
        }
    }
}
