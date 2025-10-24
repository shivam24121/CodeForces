import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            
            int[] a=new int[n];
            int[] b=new int[n];
            StringBuilder sb=new StringBuilder();
            
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                b[i]=Integer.parseInt(st.nextToken());
            }
            
            int ops=0;
            
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if(a[j]>a[j+1]){
                        ops++;
                        swap(a,j,j+1);
                        sb.append(1+" "+(j+1)).append("\n");
                    }
                }
            }
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if(b[j]>b[j+1]){
                        swap(b,j,j+1);
                        ops++;
                        sb.append(2+" "+(j+1)).append("\n");
                    }
                }
            }
            for(int i=0;i<n;i++){
                if(a[i]>b[i]){
                    ops++;
                    //swap(a[i],b[i]);
                    int temp=a[i];
                    a[i]=b[i];
                    b[i]=temp;
                    sb.append(3+" "+(i+1)).append("\n");
                }
            }
            
            System.out.println(ops);
            System.out.print(sb.toString());
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
