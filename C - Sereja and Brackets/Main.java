import java.util.*;
import java.io.*;
public class Brackets {
    static class Node{
        int open;
        int close;
        int match;

        Node(int o,int c,int m){
            this.open=o;
            this.close=c;
            this.match=m;
        }
    }
    static Node[] segTree;
    public static void Segment(int n){
        segTree=new Node[4*n];
    }
    public static void Build(int idx,String s,int l,int r){
        if(l==r){
            int open=s.charAt(l)=='('?1:0;
            int close=1-open;
            int match=0;
            segTree[idx]=new Node(open,close,match);
            return;
        }
        int mid=l+(r-l)/2;
        Build(2*idx+1,s,l,mid);
        Build(idx*2+2,s,mid+1,r);
        merge(idx);
    }
    public static void merge(int idx){
        Node l=segTree[idx*2+1];
        Node r=segTree[idx*2+2];

        int temp=Math.min(l.open,r.close);
        int open=l.open+r.open-temp;
        int close=l.close+r.close-temp;
        int match=l.match+r.match+temp;
        segTree[idx]=new Node(open,close,match);
    }
    public static Node query(int left,int right,int idx,int l,int r){
        if(left>r || right<l){
            return new Node(0,0,0);
        }
        if(l>=left && r<=right){
            return segTree[idx];
        }
        else{
            int mid=l+(r-l)/2;
            Node one=query(left,right,idx*2+1,l,mid);
            Node two=query(left,right,idx*2+2,mid+1,r);

            int temp=Math.min(one.open,two.close);
            int open=one.open+two.open-temp;
            int close=one.close+two.close-temp;
            int match=one.match+two.match+temp;
            return new Node(open,close,match);
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int n=s.length();
        Segment(n);
        Build(0,s,0,n-1);
        StringBuilder sb=new StringBuilder();
        int q=Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<q;i++){
            st=new StringTokenizer(br.readLine());
            int l=Integer.parseInt(st.nextToken())-1;
            int r=Integer.parseInt(st.nextToken())-1;
            sb.append(query(l,r,0,0,n-1).match*2).append("\n");
        }
//        for(int i=0;i<4*n;i++){
//            System.out.println(segTree[i].open+" "+segTree[i].close+" "+segTree[i].match);
//        }
        System.out.println(sb.toString());
    }
}
