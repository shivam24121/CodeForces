 public static boolean solve(int n,String a,String b){
        char[] aa=a.toCharArray();
        char[] bb=b.toCharArray();
        
        Arrays.sort(aa);
        Arrays.sort(bb);
        
        return Arrays.equals(aa,bb);
    }
}
