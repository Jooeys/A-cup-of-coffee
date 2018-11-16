/**
 * 测试单选择结构
 * author: Jooeys
 * num:000
 */
public class TestIf {
    public static void main(String[] args){
        System.out.println("🎲🎲️投掷骰子游戏🎲：三个骰子之和为15是lucky dog;10-15是try it again;<10是bad luck!");
        System.out.println("############################");
        //通过投掷三个筛子看手气如何
        int i = (int)(6*Math.random())+1;
        int j = (int)(6*Math.random())+1;
        int k = (int)(6*Math.random())+1;
        int count = i + j + k;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println("############################");
        System.out.println(i+"+"+j+"+"+k+"="+(i+j+k));
        System.out.println("############################");
        //如果三个骰子之和大于15，则手气不错
        if (count > 15){
            System.out.println("You are a lucky dog today!");
        }
        //如果三个骰子之和在10-15之间，则手气一般
        if (count >= 10 && count <= 15){
            System.out.println("Try it again!");
        }
        //如果三个骰子之和小于10，则手气不怎么样
        if (count < 10){
            System.out.println("Bad luck!");
        }



    }
}
