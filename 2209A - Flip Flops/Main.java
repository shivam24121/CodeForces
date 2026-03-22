import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int c=obj.nextInt();
            int k=obj.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=obj.nextInt();
            }
            Arrays.sort(a);
            long ans=c;
            int i=0;
            while(i<n && ans>=a[i]){
                long diff=Math.min(ans-a[i],k);
                ans+=diff;
                k-=diff;
                ans+=a[i];
                i++;
            }
            System.out.println(ans);
        }
    }
}
