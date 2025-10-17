 public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            System.out.println(solve(n,a));
        }
    } 
    public static int solve(int n,int[] a){
        int max=Arrays.stream(a).max().getAsInt();
        return max;
    }
}
