import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int a=obj.nextInt();
            int b=obj.nextInt();
            int diff=b-a;
            int k=(int)Math.round(Math.sqrt(2*diff));
            while(k*(k+1)/2>diff){
                k--;
            }
            System.out.println(k+1);
        }
    }
}
