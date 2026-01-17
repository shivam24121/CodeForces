import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        
        int[] city=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            city[i]=Integer.parseInt(st.nextToken());
        }
        int[] tower=new int[m];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            tower[i]=Integer.parseInt(st.nextToken());
        }
        int r=0;

        int i=0,j=0;
        long ans=0;
        
        while(i<n){
            while(j+1<m && Math.abs((long)tower[j+1]-city[i])<=Math.abs((long)tower[j]-city[i])){
                j++;
            }
            ans=Math.max(ans,Math.abs((long)tower[j]-city[i]));
            i++;
        }
        System.out.println(ans);
    }
}
