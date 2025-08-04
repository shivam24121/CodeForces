import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int[] a=new int[n-2];
            for(int i=0;i<a.length;i++){
                a[i]=obj.nextInt();
            }
            boolean fl=false;
            for(int i=1;i<a.length-1;i++){
                if(a[i]==0 && a[i-1]==1 && a[i+1]==1){
                    fl=true;
                }
            }
            System.out.println(fl?"NO":"YES");
        }
    }
}
