import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int m=Integer.parseInt(st.nextToken());
        int s=Integer.parseInt(st.nextToken());
        
        if((s==0 && m>1) || s>9*m){
            System.out.println("-1 -1");
            return;
        }
        int sum=s;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<m;i++){
            int d=Math.min(9,sum);
            sb.append(d);
            sum-=d;
        }
        sum=s;
        sum-=1;
        int[] small=new int[m];
        // for(int i=0;i<m;i++){
        //     int d=Math.min(sum,9);
        //     small[m-1-i]=d;
        //     sum-=d;
        // }
        for(int i=m-1;i>=0;i--){
            int d=Math.min(9,sum);
            small[i]=d;
            sum-=d;
        }
        small[0]+=1;
        StringBuilder s2=new StringBuilder();
        for(int i:small){
            s2.append(i);
        }
        
        System.out.println(s2.toString()+" "+sb.toString());
    }
}
