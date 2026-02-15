import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        TreeMap<Integer,Integer>map=new TreeMap<>();
        
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int l=Integer.parseInt(st.nextToken());
            int r=Integer.parseInt(st.nextToken());
            
            map.put(l,map.getOrDefault(l,0)+1);
            map.put(r+1,map.getOrDefault(r+1,0)-1);
        }

        int curr=0;
        boolean fl=true;
        
        for(var e:map.values()){
            curr+=e;
            if(curr>2){
                fl=false;
                break;
            }
        }
        System.out.println(fl?"YES":"NO");
    }
}
