public class TestIfElseIfElse1 {
    public static void main(String[] args) {
        int score = (int)(100*Math.random());
        System.out.println("分数是："+score+",属于");
        if(score < 85){
            System.out.println("等级A");
        }else if(score >= 70 && score <= 84){
            System.out.println("等级B");
        }else if(score >= 60 && score <= 69){
            System.out.println("等级C");
        }else{
            System.out.println("等级D");
        }
    }
}
