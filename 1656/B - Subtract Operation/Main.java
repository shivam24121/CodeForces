import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            st=new StringTokenizer(br.readLine());
            int[] a=new int[n];
            Set<Integer>set=new HashSet<>();
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                set.add(a[i]);
            }
            boolean fl=false;
            for(int i=0;i<n;i++){
                if(set.contains(a[i]-k)){
                    fl=true;
                    break;
                }
            }
            System.out.println(fl?"YES":"NO");
        }
    }
}
