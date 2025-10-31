import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int og=Integer.parseInt(st.nextToken());
            int x=Integer.parseInt(st.nextToken());
            int d=Integer.parseInt(st.nextToken());
            int n=Integer.parseInt(st.nextToken());
            
            String s=br.readLine();
            
            int ans=0;
            for(int i=0;i<n;i++){
                char c=s.charAt(i);
                if(c=='1'){
                    ans++;
                    og=Math.max(og-d,0);
                }
                else{
                    if(og<x){
                        ans++;
                        og=Math.max(og-d,0);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
