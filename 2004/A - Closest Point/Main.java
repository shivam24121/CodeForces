import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=obj.nextInt();
            }
            if(n>2 || Math.abs(a[1]-a[0])==1){
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
        }
    }
}
