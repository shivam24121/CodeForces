import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int in15=n/15;
            int rest=n%15;
            int ct=3*in15+(Math.min(rest+1,3));
            System.out.println(ct);
        }
    }
}
