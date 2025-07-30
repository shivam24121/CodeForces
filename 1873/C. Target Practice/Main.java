import java.util.Scanner;
public class Grid{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        obj.nextLine();
        while(t-->0){
            char[][] grid=new char[10][10];
            for(int i=0;i<10;i++){
                String s=obj.nextLine();
                for(int j=0;j<10;j++){
                    grid[i][j]=s.charAt(j);
                }
            }
            int res=0;
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(grid[i][j]=='X'){
                        int temp=Math.min(Math.min(i,9-i),Math.min(j,9-j));
                        res+=(temp+1);
                    }
                }
            }
            System.out.println(res);
        }
    }
}
