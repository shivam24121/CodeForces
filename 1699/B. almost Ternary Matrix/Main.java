import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int m=obj.nextInt();
            int[][] grid=new int[n][m];
            for(int i=0;i<n;i+=2){
                for(int j=0;j<m;j+=2){
                    if(i%4==j%4){
                        grid[i][j]=1;
                        grid[i+1][j+1]=1;
                    }
                    else{
                        grid[i+1][j]=1;
                        grid[i][j+1]=1;
                    }
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(grid[i][j]+" ");
                }
                System.out.println();
            }
            
        }
        
    }
}
