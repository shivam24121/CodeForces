import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            
            long res=0;
            
            ArrayList<Long>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(Long.parseLong(st.nextToken()));
                res+=list.get(i);
            }
            while(list.size()!=1){
                
                ArrayList<Long>temp=new ArrayList<>();
               
                for(int i=1;i<list.size();i++){
                    temp.add(list.get(i)-list.get(i-1));
                }
                list=temp;
                
                res=Math.max(res,Math.abs(sum(list)));
            }
            
            System.out.println(Math.max(res,list.get(0)));
        }
    }
    public static long sum(ArrayList<Long>list){
        
        long s=0;
        for(long i:list){
            s+=i;
        }
        return s;
    }
}
