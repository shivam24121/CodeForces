import java.util.*;
public class Main{
    public static boolean sort(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1])return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int s=obj.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=obj.nextInt();
            }
            if(sort(a) || s>1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
