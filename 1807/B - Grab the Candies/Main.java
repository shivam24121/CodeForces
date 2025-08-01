import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int odd=0,even=0;
            for(int i=0;i<n;i++){
                int x=obj.nextInt();
                if((x%2)==0){
                   even+=x;
                }
                else{
                  odd+=x;
                }
            }
            if(even>odd){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
