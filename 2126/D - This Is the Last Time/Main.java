import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            int n=obj.nextInt();
            int c=obj.nextInt();
            int[][] grid=new int[n][3];
            for(int i=0;i<grid.length;i++){
                grid[i][0]=obj.nextInt();
                grid[i][1]=obj.nextInt();
                grid[i][2]=obj.nextInt();
            }
            solve(grid,c);
        }
    }
    /* sort the array according to the entry fees of casionos
       agar intial coins is <= entry fees of any casino and real value of money is => then visit
       and store the max profit*/
       
    public static void solve(int[][]a,int c){
        Arrays.sort(a,Comparator.comparingInt(x->x[0]));
        int res=c;
        for(int i=0;i<a.length;i++){
            int[] temp=a[i];
            if(temp[0]<=res && res<=temp[1]){
                res=Math.max(res,temp[2]);
            }
        }
        System.out.println(res);
    }
    
}
