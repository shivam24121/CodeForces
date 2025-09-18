import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int s=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());
        int[][] a=new int[n][2];
        
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            a[i][0]=Integer.parseInt(st.nextToken());
            a[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a,Comparator.comparingInt(d->d[0]));
        
        for(int i=0;i<n;i++){
            int dragon=a[i][0];
            int bonus=a[i][1];
            
            if(s>dragon){
                s+=bonus;
            }
            else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
