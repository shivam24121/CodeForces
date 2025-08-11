import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                a[i]=obj.nextInt();
            }
             for(int i=0;i<n;i++){
                b[i]=obj.nextInt();
            }
            solve(a,b);
        }
    }
    public static void solve(int[] a,int[] b){
        int n=b.length;
        int ct=0;
        while(true){
            boolean inc=false,dec=false;
            for(int i=0;i<n;i++){
                if(a[i]>b[i]){
                    dec=true;
                    break;
                }
            }
            for(int i=0;i<n;i++){
                if(a[i]<b[i]){
                    inc=true;
                    break;
                }
            }
            ct++;
            if(dec){
                for(int i=0;i<n;i++){
                    if(a[i]>b[i]){
                        a[i]--;
                        break;
                    }
                }
            }
            if(inc){
                for(int i=0;i<n;i++){
                    if(a[i]<b[i]){
                        a[i]++;
                        break;
                    }
                }
            }
            if(!dec)break;
        }
        System.out.println(ct);
    }
}
