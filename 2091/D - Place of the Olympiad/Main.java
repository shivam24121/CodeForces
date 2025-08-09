import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            solve(obj);
        }
    }
    
    /* ek row me maximum participants can be maxbench length then one empty bench and repeat this process
    until m th row me less then maxbench length seats na bacche . after that we can fill the rest remaining bech 
    becoz unki length hamesha max bench length se kam hogi . 
    after that mutiple by n columns and check if it is greater then k or not.
    if greater then hum mid ko kam karenge and look for lesser length of max bench size 
    otherwise increase the length of max bench length*/
    
    public static void solve(Scanner obj){
        long n=obj.nextLong();
        long m=obj.nextLong();
        long k=obj.nextLong();
        long low=1,mid,high=m;   
        while(low<high){
            mid=(low+high)/2;
            long bench_length=m/(mid+1);
            long seat_filled=mid*bench_length;     // did this becoz of * and / have the same precedence and are evaluated left-to-right
            long rest=m%(mid+1);
            long inOneRow=seat_filled+rest;
            
            
            if(n*(inOneRow)>=k){    
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(low);
    }
}// p.s. read constraits correctly 
