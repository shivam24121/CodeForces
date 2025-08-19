import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    int t=obj.nextInt();
    obj.nextLine();
    while(t-->0){
      String s=obj.nextLine();
      int a=0,b=0,c=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='A')a++;
        else if(s.charAt(i)=='B')b++;
        else c++;
      }
      System.out.println((a+c)==b?"YES":"NO");
    }
  }
}
