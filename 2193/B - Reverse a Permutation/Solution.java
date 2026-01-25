    public static void main(String[] args) throws IOException {
 
        int t=ekint();
        while(t-->0){
            int n=ekint();
            //int[] a=arr(n);
            st=new StringTokenizer(br.readLine());
            int[] a=new int[n];
            int[] ps=new int[n+1];
 
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                ps[a[i]]=i;
            }
            int idx=-1;
 
            for(int i=0;i<n;i++){
                if(a[i]!=n-i){
                    idx=i;
                    break;
                }
            }
            if(idx!=-1){
                int curr=ps[n-idx];
                reverse(a,idx,curr);
            }
            display(a);
 
            //System.out.println();
        }
    }
