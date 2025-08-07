import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int a=obj.nextInt();
            int b=obj.nextInt();
            System.out.println(Math.min(a,b)+" "+ Math.max(a,b));
            }
    }
}
