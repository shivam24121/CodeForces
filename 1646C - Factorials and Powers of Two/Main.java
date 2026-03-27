import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        ArrayList<Long>list=new ArrayList<>();
        int curr=4;
        long val=6;
        while(val<(long)1e12+1){
            list.add(val);
            val*=curr;
            curr++;
        }
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            long n=Long.parseLong(br.readLine());
            int size=list.size();
            int res=Integer.MAX_VALUE;
            for(int mask=0;mask<(1<<size);mask++){
                long sum=0;
                for(int i=0;i<size;i++){
                    if(((mask>>i)&1)!=0){
                        sum+=list.get(i);
                    }
                }
                if(sum<=n){
                    int a=Long.bitCount(mask);
                    int b=Long.bitCount(n-sum);
                    res=Math.min(res,a+b);
                }
            }
            System.out.println(res);
        }
        
    }
}
