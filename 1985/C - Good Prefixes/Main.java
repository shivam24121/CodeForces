import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            solve(obj);
        }
    }
    public static void solve(Scanner obj){
        int n=obj.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        long sum=0,max=0;
        int ct=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            max=Math.max(max,a[i]);
            if(sum-max==max)ct++;
        }
        System.out.println(ct);
    }
}
