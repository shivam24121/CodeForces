import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int s=obj.nextInt();
            int m=obj.nextInt();
            int[][] temp=new int[n][2];
            for(int i=0;i<n;i++){
                temp[i][0]=obj.nextInt();
                temp[i][1]=obj.nextInt();
            }
            System.out.println(solve(temp,n,s,m)?"YES":"NO");
        }
    }
    public static boolean solve(int[][]a,int n,int s,int m){
        if(a[0][0]>=s){
            return true;
        }
        for(int i=1;i<n;i++){
            int gap=a[i][0]-a[i-1][1];
            if(gap>=s){
                return true;
            }
        }
        if(m-a[n-1][1]>=s){
            return true;
        }
        return false;
    }
}
