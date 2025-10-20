import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n=Integer.parseInt(br.readLine());
        int match=n*(n-1)/2;
        
        int[] game=new int[n+1];
        int[] win=new int[n+1];
        
        for(int i=0;i<match-1;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            game[x]++;
            game[y]++;
            win[x]++;
        }
        int a=-1,b=-1;
        
        for(int i=1;i<=n;i++){
            if(game[i]==n-2){
                if(a==-1){
                    a=i;
                }
                else b=i;
            }
        }
        int winner=win[a]>win[b]?a:b;
        int loser=winner==a?b:a;
        
        System.out.println(winner+" "+loser);
    }
}
