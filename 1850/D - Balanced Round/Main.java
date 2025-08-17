import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int k=obj.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=obj.nextInt();
            }
            Arrays.sort(a);
            System.out.println(solve(a,k));
        }
    }
    private static int solve(int[] a,int k){
        int n=a.length;
        int max=1;
        int left=0,ct=0;
        for(int right=1;right<n;right++){
            if(a[right]-a[right-1]>k){
                left=right;
            }
            max=Math.max(max,right-left+1);
        }
        return n-max;
    }
}
