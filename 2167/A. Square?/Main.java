  public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            //int n = Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            
            // int n=Integer.parseInt(st.nextToken());
            // int k=Integer.parseInt(st.nextToken());
            // String s=br.readLine();
            /*int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }
            */
            System.out.println(solve(a,b,c,d)?"YES":"NO");
        }
    } 
    public static boolean solve(int a,int b,int c,int d){
        return a==b && b==c && c==d;
    }
}
