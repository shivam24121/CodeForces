import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            for(int i=n-1;i>=0;i--){
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }
}
