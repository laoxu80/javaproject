public class Demo11906Control {
    public static void main(String[] args) {
        int a =106;
        int b=20;
        int max=a>b?a:b;
        System.out.println(max);
        int maxif;
        if (a>b){
            maxif=a;
        }
        else{
            maxif=b;
        }
        System.out.println(maxif);
    }

}
