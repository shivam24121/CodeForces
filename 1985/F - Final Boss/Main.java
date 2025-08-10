import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int h=obj.nextInt();
            int n=obj.nextInt();
            int[] a=new int[n];
            int[] c=new int[n];
            for(int i=0;i<n;i++){
                a[i]=obj.nextInt();
            }
            for(int i=0;i<n;i++){
                c[i]=obj.nextInt();
            }
            solve(h,a,c);
        }
    }
    //monotonic func.
    // keep checking for the value where we can kill final boss until we find the lowest no. of turns required usingB.S.
       
    public static void solve(int h,int[] a,int[] c){
        long left=1,right=(long)1e12,mid;         
        while(left<right){
            mid=(left+right)/2;
            if(helper(h,a,c,mid)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        System.out.println(left);
    }
    // in the first turn attack using all force dealing the most damage and then keep attacking if cooldown is acheived
    // agar mid me hamara ans hai toh in first second we use all attacks and deal sum of a[i] 
    // uske baad wait for cooldown and attack if dmg< health of final boss
    // therefore hamara formula to calc damage dealt is (mid-1)/c[i]  and +1 in that bcz of the attack in first second 
    // iske baad multipy whole with a[i] to calulate the actual damage aur here +1 into a[i] is our damage dealt to boss on the first attack
    
    public static boolean helper(int h,int[] a,int[] c,long mid){
        long dmg=0;
        for(int i=0;i<a.length;i++){
            long times=(mid-1)/c[i]+1;
            //to prevent overflow check if mid is very large and a[i] is large too , then during multiplication of times*a[i] overflow can occur
           
            if(times>(long)1e18/a[i]){
                dmg=(long)1e18;               // therefore if times is very large then it is certain that dmg>> helath of boss of no need to mutiply with a[i] just return rue
            }
            else{
                dmg+=times*(long)a[i];
            }
            if(dmg>=h)return true;  // early exit
        }
        return dmg>=h;
    }
}
