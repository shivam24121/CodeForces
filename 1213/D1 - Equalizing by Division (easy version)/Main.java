import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int[] a=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer>low=new ArrayList<>();
        for(int i:a){
            while(i>0){
                low.add(i);
                i/=2;
            }
        }
        int res=Integer.MAX_VALUE;
        for(int val:low){
            ArrayList<Integer>temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                int x=a[i];
                int ct=0;
                while(x>val){
                    ct++;
                    x=x>>1;
                }
                if(x==val){
                    temp.add(ct);
                }
            }
            if(temp.size()<k)continue;
            Collections.sort(temp);
            int now=0;
            for(int i=0;i<k;i++){
                now+=temp.get(i);
            }
            res=Math.min(res,now);
        }
        System.out.println(res);
    }
}
