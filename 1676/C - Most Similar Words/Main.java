import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
          StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            String[] str=new String[n];
            for(int i=0;i<n;i++){
                str[i]=br.readLine();
            }
            Arrays.sort(str);
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int diff=0;
                    for(int k=0;k<m;k++){
                        diff+=Math.abs(str[i].charAt(k)-str[j].charAt(k));
                    }
                    min=Math.min(min,diff);
                }
            }
            System.out.println(min);
        }
    }
}
