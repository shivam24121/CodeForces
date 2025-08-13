import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int x=obj.nextInt();
            diff=Math.min(diff,Math.abs(x-0));
        }
        System.out.println(diff);
    }
}
