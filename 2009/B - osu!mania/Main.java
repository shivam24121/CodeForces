import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0){
            List<Integer> l=new ArrayList<>();
            int n=obj.nextInt();
            obj.nextLine();
            char[][] c=new char[n][4];
            for(int i=0;i<n;i++){
                String s=obj.nextLine();
                for(int j=0;j<4;j++){
                    c[i][j]=s.charAt(j);
                    if(c[i][j]=='#'){
                        l.add(j+1);
                    }
                }
            }
            for(int i=l.size()-1;i>=0;i--){
                System.out.print(l.get(i)+" ");
            }
            System.out.println();
        }
    }
}
