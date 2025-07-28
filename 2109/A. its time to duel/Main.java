import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int[] duels=new int[n];
            for(int i=0;i<n;i++){
                duels[i]=obj.nextInt();
            }
            boolean twozeros=false;
            for(int i=0;i<n-1;i++){
                if(duels[i]==0 && duels[i+1]==0){
                    twozeros=true;
                    break;
                }
            }
            boolean allone=true;
            for(int i=0;i<n;i++){
                if(duels[i]==0){
                    allone=false;
                    break;
                }
            }
            if(twozeros||allone){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
