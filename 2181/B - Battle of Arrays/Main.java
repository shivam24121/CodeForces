import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            
            PriorityQueue<Integer>a=new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer>b=new PriorityQueue<>(Collections.reverseOrder());
            
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a.offer(Integer.parseInt(st.nextToken()));
            }
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<m;i++){
                b.offer(Integer.parseInt(st.nextToken()));
            }
            boolean alice=true;
            
            while(!a.isEmpty() && !b.isEmpty()){
                if(alice){
                    int y=b.poll();
                    if(y>a.peek()){
                        b.offer(y-a.peek());
                    }
                }
                else{
                    int x=a.poll();
                    if(x>b.peek()){
                        a.offer(x-b.peek());
                    }
                }
                alice=!alice;
            }
            System.out.println(a.isEmpty()?"Bob":"Alice");
        }
    }
}
