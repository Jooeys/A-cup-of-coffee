public class TestDoWhile {
    public static void main(String[] args) {
            int i = 0;
            int sum = 0;
            do {
                sum += i; // sum = sum + i
                i++;
            } while (i <= 100);//此处的；不能省略
            System.out.println("Sum= " + sum);
    }
}
