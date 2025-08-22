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
            Arrays.sort(a);
            a[0]++;
            int ct=1;
            for(int i=0;i<n;i++){
                ct*=a[i];
            }
            System.out.println(ct);
        }
    }
}
