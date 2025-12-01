import java.util.*;
import java.io.*;
public class Main{
    static class Pair{
        int val;
        int idx;
        Pair(int v,int i){
            this.val=v;
            this.idx=i;
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            Pair[] a=new Pair[n];
            for(int i=0;i<n;i++){
                int x=Integer.parseInt(st.nextToken());
                a[i]=new Pair(x,i+1);
            }
            
            Arrays.sort(a,(x,y)->x.val-y.val);
            int res=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    long temp=1L*a[i].val*a[j].val;
                    if(temp>2L*n)break;
                    if(temp==(a[i].idx+a[j].idx)){
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
