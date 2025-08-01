import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int a=obj.nextInt();
            int b=obj.nextInt();
            int c=obj.nextInt();
            if(a+b==c){
                System.out.println('+');
            }
            else{
                System.out.println('-');
            }
        }
    }
}
