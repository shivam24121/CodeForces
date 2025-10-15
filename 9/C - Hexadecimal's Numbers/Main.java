import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Queue<Long>queue=new LinkedList<>();
        queue.add(1L);
        int ct=0;
        while(!queue.isEmpty()){
            long curr=queue.remove();
            if(curr>n){
                continue;
            }
            ct++;
            queue.add(curr*10);
            queue.add(curr*10+1);
        }
        System.out.println(ct);
    }
}
