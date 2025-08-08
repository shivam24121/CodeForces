import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int x=obj.nextInt();
            int max=0,last=0;
            for(int i=0;i<n;i++){
                int a=obj.nextInt();
                max=Math.max(max,a-last);
                last=a;
            }
            max=Math.max(max,(x-last)*2);
            System.out.println(max);
        }
    }
}
