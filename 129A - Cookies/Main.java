import java.util.*;
import java.io.*;

public class Main{

    static int max=17;
    static int[][] table;

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    //     StringTokenizer st=new StringTokenizer(br.readLine());
    //     int n=Integer.parseInt(st.nextToken());
    //     int q=Integer.parseInt(st.nextToken());

    //     int[] parent=new int[n];
    //     parent[0]=-1;
    //     st=new StringTokenizer(br.readLine());
    //     for(int i=1;i<n;i++){
    //         parent[i]=Integer.parseInt(st.nextToken())-1;
    //     }

    //     build(parent,n);
    //     StringBuilder sb=new StringBuilder();
    //     for(int i=0;i<q;i++){
    //         st=new StringTokenizer(br.readLine());
    //         int a=Integer.parseInt(st.nextToken())-1;
    //         int k=Integer.parseInt(st.nextToken());
    //         int res=solve(a,k);
    //         sb.append(res==-1?-1:res+1).append('\n');
    //     }
    //     System.out.println(sb.toString());
    // }
    // public static void build(int[] parent,int n){
    //     table=new int[max][n];
    //     for(int i=0;i<n;i++){
    //         table[0][i]=parent[i];
    //     }
    //     for(int i=1;i<max;i++){
    //         for(int j=0;j<n;j++){
    //             int prev=table[i-1][j];
    //             if(prev==-1){
    //                 table[i][j]=-1;
    //             }
    //             else{
    //                 table[i][j]=table[i-1][prev];
    //             }
    //         }
    //     }
    // }
    // public static int solve(int a,int k){
    //     for(int i=0;i<max;i++){
    //         if(a==-1)return -1;
    //         int mask=1<<i;
    //         if((k&mask)>0){
    //             a=table[i][a];
    //             if(a==-1)return -1;
    //         }
    //     }
    //     return a;
        int t=1;
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int[] a=new int[n];
            int sum=0;
            int odd=0,even=0;
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                sum+=a[i];
                if(solve(a[i])){
                    odd++;
                }
                else{
                    even++;
                }
            }
            System.out.println((sum%2)==0?even:odd);
        }
    }
    public static boolean solve(int n){
        return (n&1)==1;
    }
    
}
