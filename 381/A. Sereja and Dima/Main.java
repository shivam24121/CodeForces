import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        int sereja=0;
        int dima=0;
        int i=0,j=a.length-1;
        int turn=0;
        while(i<=j){
            int pick;
            if(a[i]>a[j]){
                pick=a[i++];
            }
            else{
                pick=a[j--];
            }
            if(turn%2==0){
                sereja+=pick;
            }
            else{
                dima+=pick;
            }
            turn++;
        }
        System.out.println(sereja+" "+dima);
    }
}
