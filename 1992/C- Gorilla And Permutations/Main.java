import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int m=obj.nextInt();
            int k=obj.nextInt();
            solve(n,m,k);
        }
    }
    public static void solve(int n,int m,int k){
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=n-i;
        }
        int l=n-m,r=n-1;
        while(l<r){
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
