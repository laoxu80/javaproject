public class Demo111012 {
    public static void main(String[] args) {
        //求出1-100偶数和
        int sum=0;
        for(int i=1;i<=100;i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                break;
            }
        }
        System.out.println(sum);
    }
}
