public class Demo11903Control {
    public static void main(String[] args) {
        int score = 12;
        if(score>100 ||score<0){
            System.out.println("wrong");
        }
        else if(score>=90){
            System.out.println("优秀");
        }
        else if(score>=80){
            System.out.println("好");
        }
        else if(score>=70){
            System.out.println("良");
        }
        else if(score>=60){
            System.out.println("及格");
        }
        else {
            System.out.println("不及格");
        }

    }
}
