import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int ct=0;
            boolean fl=false;
            for(int i=0;i<n;i++){
                int x=obj.nextInt();
                if((x & 1)==1)ct++;
                else{
                    fl=true;
                }
            }
            System.out.println(fl?ct+1:ct-1);
        }
    }
}
