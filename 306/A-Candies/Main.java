import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int m=obj.nextInt();
    int min=n/m;
    int extra=n%m;
    for(int i=0;i<m;i++){
        if(extra>i){
            System.out.print((min+1)+" ");
        }
        else{
            System.out.print(min+" ");
        }
    }
  }
}
