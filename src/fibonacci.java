public class fibonacci {
    public static void main(String[] args){
        int n=1 , m=0 ;
        for (int i=1; i <=100; i++) {
            int b = n + m;
            System.out.println(b);
            m=n;
            n=b;
            i=b;

        }
    }
}
