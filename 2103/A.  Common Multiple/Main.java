import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            boolean[] check=new boolean[101];
            int total=0;
            for(int i=0;i<n;i++){
                int x=obj.nextInt();
                if(!check[x]){
                    total++;
                    check[x]=true;
                }
            }
            System.out.println(total);
        }
    }
}
