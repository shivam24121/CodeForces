import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int t=obj.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        int left=0,max=0;
        int cur=0;
        for(int right=0;right<n;right++){
            cur+=a[right];
            if(cur<=t){
                max=Math.max(max,right-left+1);
            }
            while(cur>t){
                cur-=a[left];
                left++;
            }
        }
        System.out.println(max);
    }
}
