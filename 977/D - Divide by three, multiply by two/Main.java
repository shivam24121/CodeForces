import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<Long>list=new ArrayList<>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            long curr=Long.parseLong(st.nextToken());
            list.add(curr);
        }
        
        Collections.sort(list,(a,b)->{
            long aa=div3(a),bb=div3(b);
            return aa!=bb?Long.compare(bb,aa):Long.compare(a,b);
        });
        
        for(int i=0;i<n;i++){
            System.out.print(list.get(i)+" ");
        } 
        System.out.println();
            
    }
    public static long div3(long n){
        long ct=0;
        while(n%3==0){
            ct++;
            n/=3;
        }
        return ct;
    }
}
