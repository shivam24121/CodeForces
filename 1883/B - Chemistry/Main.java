import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            String s=br.readLine();
            Map<Character,Integer>map=new HashMap<>();
            for(char c:s.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            int ct=0;
            for(Map.Entry<Character,Integer>entry:map.entrySet()){
                if(entry.getValue()%2==1){
                    ct++;
                }
            }
            System.out.println(ct-1<=k?"yes":"no");
        }
    }
}
