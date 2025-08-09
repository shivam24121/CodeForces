import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            solve(obj);
        }
    }
    public static void solve(Scanner obj){
        int n=obj.nextInt();
        int x=obj.nextInt();
        String s=obj.next();
        if(x==1 || x==n){               // agar woh edge pe ho
            System.out.println(1);
            return;
        }
        x--;
        int left=-1,right=n;
        for(int i=x-1;i>=0;i--){    // left nearest cell 
            if(s.charAt(i)=='#'){
                left=i;
                break;
            }
        }
        for(int i=x+1;i<n;i++){
            if(s.charAt(i)=='#'){
                right=i;                 // right nearest cell
                break;
            }   
        }
        if(left==-1 && right==n){
            System.out.println("1");       // no cell found then woh 1day ko farar
            return;
        }
        int leftop=Math.min(x+1,n-right+1);   // dis bw start to hamid pos, dis bw right nearest cell and right edge
        int rightop=Math.min(left+2,n-x);        // dis bw left nearest cell and left (+2) to make the make it inclusive , dis bw current to right edge
        System.out.println(Math.max(leftop,rightop));

    }
}
