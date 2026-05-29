import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=1;
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            String s=br.readLine();
            
            int ct=(int)s.chars()
                    .distinct()
                    .count();
                    
            int l=0;
            int ans=n;
            int curr=0;
            
            Map<Character,Integer>map=new HashMap<>();
            
            for(int r=0;r<n;r++){
                
                map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
                
                while(map.size()==ct){
                    ans=Math.min(ans,r-l+1);
                    char left=s.charAt(l);
                    map.put(left,map.getOrDefault(left,0)-1);
                    if(map.get(left)<=0){
                        map.remove(left);
                    }
                    l++;
                }
            }
            
            System.out.println(ans);
        }
    }
}
