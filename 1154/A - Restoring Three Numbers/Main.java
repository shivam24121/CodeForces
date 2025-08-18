import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int[] a=new int[4];
        for(int i=0;i<4;i++){
            a[i]=obj.nextInt();
        }
        Arrays.sort(a);
        System.out.print((a[0]+a[1])-a[3]+" ");
        System.out.print((a[1]+a[2])-a[3]+" ");
        System.out.println((a[0]+a[2])-a[3]);
    }
}
