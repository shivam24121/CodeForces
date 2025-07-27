import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            System.out.print("1 ");
            for(int i=3;i<=n;i++){
                System.out.print(i+" ");
            }
            System.out.println("2");
        }
    }
}
