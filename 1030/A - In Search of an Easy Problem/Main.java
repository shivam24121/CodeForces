import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt();
            if(a[i]==1){
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}
