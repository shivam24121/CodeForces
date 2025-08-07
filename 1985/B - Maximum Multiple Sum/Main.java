import java.util.Scanner;
public class Main{
    public static void main(String[] arrgs){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            if(n==3){
                System.out.println("3");
            }
            else{
               System.out.println("2");
            }
        }
    }
}
