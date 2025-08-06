import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                a[i]=obj.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=obj.nextInt();
            }
            Set<Integer> sa=new HashSet<>();
            Set<Integer> sb=new HashSet<>();
            for(int i=0;i<n;i++){
                sa.add(a[i]);
                sb.add(b[i]);
            }
            if(sa.size()+sb.size()<4){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
