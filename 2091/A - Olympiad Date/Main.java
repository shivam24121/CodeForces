import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int[] ct=new int[10];
            int n=obj.nextInt();
            boolean fl=false;
            for(int i=0;i<n;i++){
                int x=obj.nextInt();
                ct[x]++;
                if(ct[0]>=3 && ct[1]>=1 && ct[2]>=2 && ct[3]>=1 && ct[5]>=1 && !fl){
                    System.out.println(i+1);
                    fl=true;
                }
            }
            if(!fl){
                System.out.println(0);
            }
        }
    }
}
