import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            int[] a=new int[n];
            int[] b=new int[m];
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<m;i++){
                b[i]=Integer.parseInt(st.nextToken());
            }
            System.out.println(solve(a,b,k)?"YES":"NO");
        }
    }
    public static boolean solve(int[] a,int[] b,int k){
        Set<Integer> s1=Arrays.stream(a).boxed().collect(Collectors.toSet());
        Set<Integer> s2=Arrays.stream(b).boxed().collect(Collectors.toSet());
        int inA=0,inB=0,common=0;
        for(int i=1;i<=k;i++){
            if(s1.contains(i)){
                if(s2.contains(i)){
                    common++;
                }
                else{
                    inA++;
                }
            }
            else if(s2.contains(i)){
                inB++;
            }
            else{
                return false;
            }
        }
        return Math.min(inA,inB)+common>=k/2;
    }
}
