import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            solve(n);
        }
    }
    /* sum of subarray >0 stritly
    product should be negative of adjacent element
    lexigrapically smaller
    
    three cases 
      1-n is odd
      2-n is even
      3 n==2 (watermelon question pattern)
      
      --1 3 -1 3 
      but in even >2 we can do -1 2 at last so all 3 conditions are satisfied*/
    
    public static void solve(int n){
        if((n & 1)==1){
            for(int i=0;i<n;i++){
                if(i%2==0){
                    System.out.print("-1 ");
                }
                else{
                    System.out.print("3 ");
                }
            }
            System.out.println();
            return;
        }
        if(n==2){
            System.out.println("-1 2");
            return;
        }
        for(int i=0;i<n-2;i++){
            if(i%2==0){
                System.out.print("-1 ");
            }
            else{
                System.out.print("3 ");
            }
        }
        System.out.println("-1 2");
    }
}
