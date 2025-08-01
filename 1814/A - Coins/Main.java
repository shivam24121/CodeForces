import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            long n=obj.nextLong();
            long k=obj.nextLong();
            if(n%2==0 || k%2==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
