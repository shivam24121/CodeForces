import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine());
        while(tc-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int q=Integer.parseInt(st.nextToken());
            String s=br.readLine();
            String t=br.readLine();
            int[][] prefixS=new int[n+1][28];
            int[][] prefixT=new int[n+1][28];
            for(int i=0;i<n;i++){
                int c=s.charAt(i)-'a'+1;
                prefixS[i+1][c]++;
            }
            for(int i=0;i<n;i++){
                int c=t.charAt(i)-'a'+1;
                prefixT[i+1][c]++;
            }
            for(int i=1;i<=n;i++){
                for(int j=1;j<27;j++){
                    prefixS[i][j]+=prefixS[i-1][j];
                    prefixT[i][j]+=prefixT[i-1][j];
                }
            }
            StringBuilder sb=new StringBuilder();
            for(int re=0;re<q;re++){
                st=new StringTokenizer(br.readLine());
                int l=Integer.parseInt(st.nextToken());
                int r=Integer.parseInt(st.nextToken());
                int temp=0;
                for(int i=0;i<27;i++){
                    int RS=prefixS[r][i];
                    int LS=l-1>0?prefixS[l-1][i]:0;
                    int RT=prefixT[r][i];
                    int LT=l-1>0?prefixT[l-1][i]:0;
                    
                    temp+=Math.abs((RS-LS)-(RT-LT));
                }
                sb.append(temp/2).append("\n");
            }
            System.out.println(sb.toString());
        }
    }
}
