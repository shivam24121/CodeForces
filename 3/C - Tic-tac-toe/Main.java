import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char[][] game=new char[3][3];
        
        for(int i=0;i<3;i++){
            String line=br.readLine();
            for(int j=0;j<3;j++){
                game[i][j]=line.charAt(j);
            }
        }
        solve(game);
    }
    public static void solve(char[][] game){
        int ctX=0,ct0=0;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(game[i][j]=='X')ctX++;
                if(game[i][j]=='0')ct0++;
            }
        }
        
        boolean a=win(game,'X');
        boolean b=win(game,'0');
        
        if(ctX-ct0>=2 || ct0>ctX){
            System.out.println("illegal");
        }
        else if(a && b){
            System.out.println("illegal");
        }
        else if(a && ctX==ct0+1){
            System.out.println("the first player won");
        }
        else if(b && ctX==ct0){
            System.out.println("the second player won");
        }
        else if(ctX+ct0==9){
            System.out.println("draw");
        }
        else if(!a && !b && ctX==ct0){
            System.out.println("first");
        }
        else if(!a && !b && ctX>ct0){
            System.out.println("second");
        }
        else{
            System.out.println("illegal");
        }
        
    }
    public static boolean win(char[][] c,char x){
        for(int i=0;i<3;i++){
            if(c[i][0]==x && c[i][1]==x && c[i][2]==x){
                return true;
            }
        }
        
        for(int i=0;i<3;i++){
            if(c[0][i]==x && c[1][i]==x && c[2][i]==x){
                return true;
            }
        }
        if(c[1][1]==x && c[0][0]==x && c[2][2]==x){
            return true;
        }
        if(c[0][2]==x && c[1][1]==x && c[2][0]==x){
            return true;
        }
        return false;
    }
}

