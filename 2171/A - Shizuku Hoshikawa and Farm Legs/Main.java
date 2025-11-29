import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            if(n%2==1){
                System.out.println(0);
                continue;
            }
            int temp=n/2;
            int res=(temp/2)+1;
            System.out.println(res);
        }
    }
}
