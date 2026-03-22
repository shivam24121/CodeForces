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
            int[] res=new int[n];
            for(int i=0;i<n;i++){
                int small=0;
                int large=0;
                for(int j=i+1;j<n;j++){
                    if(a[j]>a[i])large++;
                    if(a[j]<a[i])small++;
                }
                res[i]=Math.max(large,small);
            }
            for(int i=0;i<n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
}
