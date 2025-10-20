    public static int solve(int n,int k,String s){
        int res=0;
        int temp=-1;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='1'){
                if(temp==-1 || i-temp>=k){
                    res++;
                }
                temp=i;
            }
        }
        return res;
    }
}
