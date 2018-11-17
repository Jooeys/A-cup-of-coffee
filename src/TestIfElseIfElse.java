public class TestIfElseIfElse {
    public static void main(String[] args) {
        int age = (int)(100*Math.random());
        System.out.println("年龄是："+age+",属于");
        if(age < 15){
            System.out.println("你是个未成年人");
        }else if(age < 25){
            System.out.println("青年人，处在求学阶段");
        }else if(age < 45){
            System.out.println("中年人，处于工作阶段");
        }else if(age < 65){
            System.out.println("中老年人，处于退休阶段");
        }else if(age < 85){
            System.out.println("老年人，多运动");
        }else{
            System.out.println("老寿星，古来稀！");
        }
    }
}
