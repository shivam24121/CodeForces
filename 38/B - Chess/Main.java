import java.util.*;
import java.io.*;
public class Main{
    static int[] dx={2,2,-2,-2,1,1,-1,-1};
    static int[] dy={1,-1,1,-1,2,-2,2,-2};
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String rook=br.readLine();
        String knight=br.readLine();
        
        int r1=rook.charAt(0)-'a';
        int r2=rook.charAt(1)-'1';
        int k1=knight.charAt(0)-'a';
        int k2=knight.charAt(1)-'1';
        
        boolean[][] occurpied=new boolean[8][8];
        boolean[][] attack=new boolean[8][8];
        
        occurpied[r1][r2]=true;
        occurpied[k1][k2]=true;
        
        for(int i=0;i<8;i++){
            attack[i][r2]=true;
            attack[r1][i]=true;
        }
        for(int i=0;i<8;i++){
            int kx=k1+dx[i];
            int ky=k2+dy[i];
            if(kx>=0 && kx<8 && ky>=0 && ky<8){
                attack[kx][ky]=true;
            }
        }
        int ct=0;
        
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(occurpied[i][j])continue;
                if(attack[i][j])continue;
                
                boolean fl=true;
                
                for(int k=0;k<8;k++){
                    int tempx=i+dx[k];
                    int tempy=j+dy[k];
                    
                    if(tempx==r1 && tempy==r2){
                        fl=false;
                        break;
                    }
                    if(tempx==k1 && tempy==k2){
                        fl=false;
                        break;
                    }
                }
                if(fl)ct++;
            }
        }
        System.out.println(ct);
    }
}
