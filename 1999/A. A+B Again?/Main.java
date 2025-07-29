import java.util.Scanner;
public class  Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int sum=0,a=0;
            while(n>0){
                a=n%10;
                sum+=a;
                n/=10;
            }
            System.out.println(sum);
        }
    }
}
