import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int x=Integer.parseInt(st.nextToken());
            a[i]=x;
        }
        int ct25=0,ct50=0;
        boolean fl=true;
        
        for(int x:a){
            if(x==25){
                ct25++;
                
            }
            else if(x==50){
                if(ct25==0){
                    fl=false;
                    break;
                }
                ct50++;
                ct25--;
            }
            else if(x==100){
                if(ct25>0 && ct50>0){
                    ct25--;
                    ct50--;
                }
                else if(ct25>=3){
                    ct25-=3;
                }
                else{
                    fl=false;
                    break;
                }
            }
        }
        System.out.println(fl?"YES":"NO");
    }
}
