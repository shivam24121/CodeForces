import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=obj.nextInt();
            }
            System.out.println(solve(n,a));
        }
    }
    public static int solve(int n,int[] a){
        int ct=0;
        for(int i=1;i<n;i++){
            if(a[i]==a[i-1] || (a[i]+a[i-1])==7){
                ct++;
                i++;
            }
        }
        return ct;
    }
}
