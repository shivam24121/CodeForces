import java.util.*;
import java.util.stream.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int mx=obj.nextInt();
        int[] h=new int[n];
        for(int i=0;i<n;i++){
            h[i]=obj.nextInt();
        }
        System.out.println(solve(h,mx));
    }
    private static int solve(int[] a,int m){
        int res=Arrays.stream(a)
        .map(ht->ht>m?2:1)
        .sum();
        return res;
    }
}
