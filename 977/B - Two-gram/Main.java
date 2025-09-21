import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s=br.readLine();
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<n-1;i++){
            String temp=s.substring(i,i+2);
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        int curr=0;
        String res="";
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()>curr){
                curr=entry.getValue();
                res=entry.getKey();
            }
        }
        System.out.println(res);
    }
}
