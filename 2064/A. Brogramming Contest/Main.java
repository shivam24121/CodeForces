import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            obj.nextLine();
            String s=obj.nextLine();
            int ct=0;
            for(int i=0;i<n-1;i++){
                if(s.charAt(i) != s.charAt(i+1)){
                    ct++;
                }
            }
            if(s.charAt(0)=='1')ct++;
            System.out.println(ct);
        }
    }
}
