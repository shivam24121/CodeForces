import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int l=obj.nextInt();
        int b=obj.nextInt();
        int ct=0;
        while(l<=b){
            l*=3;
            b*=2;
            ct++;
        }
        System.out.println(ct);
    }
}
