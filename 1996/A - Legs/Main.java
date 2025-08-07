import java.util.Scanner;
public class Main{
    public static void main(String[] arrgs){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            System.out.println((n+2)/4);
        }
    }
}
