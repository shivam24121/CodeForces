import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            String s=br.readLine();
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int max=0;
        String res="";
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                res=entry.getKey();
            }
        }
        System.out.println(res);
    }
}
