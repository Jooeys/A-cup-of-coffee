/**
 * 测试嵌套循环
 * author: Jooeys
 */
public class TestNestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("****************************");
        //1*2=2 2*2=4 print multiplication table

        for (int n = 1; n <= 9; n++) {
            for (int m = 1; m <= n; m++) {
                System.out.print(m + "*" + n + "=" + (m * n) + "\t");
            }
            System.out.println();
        }
    }
}