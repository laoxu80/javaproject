public class Demo111011While {
    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            System.out.println("continue"+i);
            i++;

        }
        Dowhile();
    }
    public static void Dowhile(){
        int y=1;
        do{
            System.out.println("do"+y);
            y++;
        }while (y<=20);
    }
}

