import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int m=Integer.parseInt(st.nextToken());
            int n=Integer.parseInt(st.nextToken());
            int[][] a=new int[m][n];
            for(int i=0;i<m;i++){
                st=new StringTokenizer(br.readLine());
                for(int j=0;j<n;j++){
                    a[i][j]=Integer.parseInt(st.nextToken());
                }
            }
            Map<Integer,Long>m1=new HashMap<>(); //i-j;
            Map<Integer,Long>m2=new HashMap<>(); //i+j;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    m1.put(i-j,m1.getOrDefault(i-j,0L)+a[i][j]);
                    m2.put(i+j,m2.getOrDefault(i+j,0L)+a[i][j]);
                }
            }
            long ans=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    long sum=m1.get(i-j)+m2.get(i+j)-a[i][j];
                    ans=Math.max(ans,sum);
                }
            }
            System.out.println(ans);
        }
    }
}
