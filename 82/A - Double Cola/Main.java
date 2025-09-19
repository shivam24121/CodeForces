import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,String>map=new HashMap<>();
        
        //Sheldon, Leonard, Penny, Rajesh and Howard 
        
        map.put(1,"Sheldon");
        map.put(2,"Leonard");
        map.put(3,"Penny");
        map.put(4,"Rajesh");
        map.put(5,"Howard");
        
        int n=Integer.parseInt(br.readLine());
        long total=5;
        long block=1;
        
        while(n>total){
            block*=2;
            total+=5*block;
        }
        long temp=total-(5*block);
        int idx=(int)((n-temp-1)/block);
        System.out.println(map.get(idx+1));
    }
}
