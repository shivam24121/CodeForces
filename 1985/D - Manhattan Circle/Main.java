import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int m=Integer.parseInt(st.nextToken());
            int n=Integer.parseInt(st.nextToken());
            char[][] a=new char[m][n];
            for(int i=0;i<m;i++){
                String s=br.readLine();
                for(int j=0;j<n;j++){
                    a[i][j]=s.charAt(j);
                }
            }
            int minrow=m;
            int maxrow=-1;
            int mincol=n;
            int maxcol=-1;
            
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(a[i][j]=='#'){
                        minrow=Math.min(minrow,i+1);
                        maxrow=Math.max(maxrow,i+1);
                        mincol=Math.min(mincol,j+1);
                        maxcol=Math.max(maxcol,j+1);
                    }
                }
            }
            System.out.println((minrow+maxrow)/2+" "+(mincol+maxcol)/2);
        }
    }
}
