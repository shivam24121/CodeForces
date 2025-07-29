import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int a=obj.nextInt();
            int b=obj.nextInt();
            int min=Integer.MAX_VALUE;
            for(int i=a;i<=b;i++){
                int c=(i-a)+(b-i);
                min=Math.min(min,c);
            }
            System.out.println(min);
        }
    }
}
