import java.util.*;
import java.io.*;

public class SegmentTree {

    static int[] segment;

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        int size=1<<n;
        int[] a=new int[size];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<size;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        boolean fl=(n%2==1);
        segment=new int[size*4];

        build(0,0,size-1,a,fl);
        StringBuilder sb=new StringBuilder();

        while(m-->0){
            st=new StringTokenizer(br.readLine());
            int p=Integer.parseInt(st.nextToken())-1;
            int val=Integer.parseInt(st.nextToken());

            a[p]=val;

            update(p,val,0,0,size-1,a,fl);
            sb.append(segment[0]).append("\n");
        }
        System.out.println(sb.toString());

    }
    public static void build(int idx,int l,int r,int[] a,boolean fl){
        if(l==r){
            segment[idx]=a[l];
            return;
        }
        int mid=l+((r-l)>>1);
        build(2*idx+1,l,mid,a,!fl);
        build(idx*2+2,mid+1,r,a,!fl);

        if(fl){
            segment[idx]=segment[idx*2+1]|segment[idx*2+2];
        }
        else{
            segment[idx]=segment[idx*2+1]^segment[idx*2+2];
        }
    }
    public static void update(int p,int val,int idx,int l,int r,int[] a,boolean fl){
        if(l==r){
            segment[idx]=val;
            return;
        }
        int mid=l+((r-l)>>1);
        if(p<=mid){
            update(p,val,2*idx+1,l,mid,a,!fl);
        }
        else{
            update(p,val,idx*2+2,mid+1,r,a,!fl);
        }

        if(fl){
            segment[idx]=segment[idx*2+1]|segment[idx*2+2];
        }
        else{
            segment[idx]=segment[idx*2+1]^segment[idx*2+2];
        }
    }
}
