import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            if(n%4==0){
                System.out.println("BOB");
            }
            else{
                System.out.println("ALICE");
            }
        }
    }
}
