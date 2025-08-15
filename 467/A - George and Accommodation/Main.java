import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int ct=0;
        while(n-->0){
            int a=obj.nextInt();
            int b=obj.nextInt();
            if((b-a)>=2)ct++;
        }
        System.out.println(ct);
    }
}
