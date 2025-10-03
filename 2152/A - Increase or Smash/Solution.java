    public static int solve(int n,int[] a){
        if(n==1)return 1;
        Set<Integer>set=new HashSet<>();
        for(int i:a){
            set.add(i);
        }
        return set.size()+(set.size()-1);
    }
}
