import java.util.*;
import java.util.stream.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n*3];
        int idx=0;
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            a[idx++]=Integer.parseInt(st.nextToken());
            a[idx++]=Integer.parseInt(st.nextToken());
            a[idx++]=Integer.parseInt(st.nextToken());
        }
        System.out.println(solve(n,a)?"YES":"NO");
    }
    public static boolean solve(int n,int[]a){
        int one=IntStream.range(0,n*3).filter(i->i%3==0).map(i->a[i]).sum();
        int two=IntStream.range(0,n*3).filter(i->i%3==1).map(i->a[i]).sum();
        int three=IntStream.range(0,n*3).filter(i->i%3==2).map(i->a[i]).sum();
        return one==0 && two==0 && three==0;
    }
}
