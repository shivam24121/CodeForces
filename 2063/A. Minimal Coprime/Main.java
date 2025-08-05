import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int x=obj.nextInt();
            int y=obj.nextInt();
            if(x==y && x==1){
                System.out.println('1');
            }
            else{
                System.out.println(Math.abs(x-y));
            }
        }
    }
}
