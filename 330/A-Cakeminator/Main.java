import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    int r=obj.nextInt();
    int c=obj.nextInt();
    obj.nextLine();
    char[][] cake=new char[r][c];
    boolean[][] eat=new boolean[r][c];
    for(int i=0;i<r;i++){
        String line=obj.nextLine();
        for(int j=0;j<c;j++){
            cake[i][j]=line.charAt(j);
        }
    }
    for(int i=0;i<r;i++){
        boolean s=false;
        for(int j=0;j<c;j++){
            if(cake[i][j]=='S'){
                s=true;
                break;
            }
        }
        for(int j=0;j<c;j++){
            if(!s){
                eat[i][j]=true;
            }
        }
    }
    for(int i=0;i<c;i++){
        boolean s=false;
        for(int j=0;j<r;j++){
            if(cake[j][i]=='S'){
                s=true;
                break;
            }
        }
        for(int j=0;j<r;j++){
            if(!s){
                eat[j][i]=true;
            }
        }
    }
    int ct=0;
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
           if(eat[i][j])ct++;
        }
    }   
    System.out.println(ct);    
    }

}
