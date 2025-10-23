import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            
            System.out.println(solve(n,a)?"YES":"NO");
        }
    }
    public static boolean solve(int n,int[] a){
        Set<Long>set=new HashSet<>();
        set.add(0L);
        long even=0,odd=0;
        for(int i=0;i<n;i++){
            if(i%2==1){
                even+=a[i];
            }
            else{
                odd+=a[i];
            }
            long diff=even-odd;
            if(set.contains(diff))return true;
            set.add(diff);
        }
        return false;
    }
}
