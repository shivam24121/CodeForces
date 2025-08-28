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
            boolean fl=true;
            int ct=0;
            for(int i=n-2;i>=0;i--){
                while(a[i]>=a[i+1] && a[i]>0){
                    a[i]/=2;
                    ct++;
                }
                if(a[i]==a[i+1]){
                    fl=false;
                    
                }
            }
            System.out.println(!fl?-1:ct);
        }
    }
}
