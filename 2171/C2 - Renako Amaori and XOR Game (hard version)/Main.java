import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st;
            int n=Integer.parseInt(br.readLine());
            
            int[] a=new int[n];
            int[] b=new int[n];
            
            st=new StringTokenizer(br.readLine());
            
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            
            st=new StringTokenizer(br.readLine());
            
            for(int i=0;i<n;i++){
                b[i]=Integer.parseInt(st.nextToken());
            }
            
            boolean aji=false;
            boolean mai=false;
            
            for(int x=31;x>=0;x--){
                int ca=0,cb=0;
              
                for(int i=0;i<n;i++){
                    if((a[i] & (1l<<x))!=0)ca++;
                    if((b[i] & (1l<<x))!=0)cb++;
                }
                if(ca%2==cb%2)continue;
              
                for(int i=n-1;i>=0;i--){
                    if((a[i] & (1l<<x)) != (b[i] & (1l<<x))){
                        if(i%2==0){
                            aji=true;
                            break;
                        }
                        else{
                            mai=true;
                            break;
                        } 
                    }
                }
                if(aji || mai)break;
            }
            if(aji){
                System.out.println("Ajisai");
            }
            else if(mai){
                System.out.println("Mai");
            }
            else{
                System.out.println("Tie");
            }
        }
    }
}
