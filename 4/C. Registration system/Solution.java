import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Map<String,Integer>map=new HashMap<>();
        String[] a=new String[n];
        
        for(int i=0;i<n;i++){
            a[i]=br.readLine();
        }
        
        for(int i=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            if(map.get(a[i])==1){
                System.out.println("OK");
            }
            else{
                System.out.println(a[i]+String.valueOf(map.get(a[i])-1));
            }
        }
        
    }
}
