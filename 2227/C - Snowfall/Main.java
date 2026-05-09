import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws java.lang.Exception{
        
        BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            
            int[] arr=new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            ArrayList<Integer>a=new ArrayList<>();
            ArrayList<Integer>b=new ArrayList<>();
            ArrayList<Integer>c=new ArrayList<>();
            ArrayList<Integer>d=new ArrayList<>();
            
            for(int i:arr){
                if(i%6==0){
                    a.add(i);
                }
                else if(i%2==0){
                    b.add(i);
                }
                else if(i%3==0){
                    c.add(i);
                }
                else{
                    d.add(i);
                }
            }
            for(int i:a){
                System.out.print(i+" ");
            }
            for(int i:b){
                System.out.print(i+" ");
            }
            for(int i:d){
                System.out.print(i+" ");
            }
            for(int i:c){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
