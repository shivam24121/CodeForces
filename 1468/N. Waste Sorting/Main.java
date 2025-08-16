import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int  t=obj.nextInt();
        while(t-->0){
            int c1=obj.nextInt();
            int c2=obj.nextInt();
            int c3=obj.nextInt();
            int a1=obj.nextInt();
            int a2=obj.nextInt();
            int a3=obj.nextInt();
            int a4=obj.nextInt();
            int a5=obj.nextInt();
            System.out.println(solve(c1,c2,c3,a1,a2,a3,a4,a5)?"YES":"NO");
        }
    }
    /* a1 goes to c1
       a2 to c2
       a3 to c3
    ab a4 can go c1 or c2
       a5 can go c2 or c3
       
    so ab first check karenge ki a1,a2,a3 should be smaller then c1,c2,c3 respctively 
    uske baad for the waste a4 and a5 
    1) for a4 hum try karenge to throw most of a4 to c1 until it is full and then the remaining in c3
    2) similarly a5 ko maximum remaining capacity of c2 and rest in c3 aur agar yeh dono ko daalne ke baad, 
    we can still add to c3 or c3==0 then true else false*/
    
    public static boolean solve(int c1,int c2,int c3,int a1,int a2,int a3,int a4,int a5){
        if(a1>c1 ||a2>c2 ||a3>c3){
            return false;
        }
        c1-=a1;
        c2-=a2;
        c3-=a3;
        int temp=Math.max(0,(a4-c1))+Math.max(0,(a5-c2));
        return temp<=c3;
    }
}
