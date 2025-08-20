import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            Integer[] a=new Integer[n];
            for(int i=0;i<n;i++){
                a[i]=obj.nextInt();
            }
            Arrays.sort(a,Collections.reverseOrder());
            System.out.println(a[(n+1)/2-1]);
        }
    }
}
