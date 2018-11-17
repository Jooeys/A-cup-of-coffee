public class TestSwitch {
    public static void main(String[] args) {
        int month = (int) (1 + 12 * Math.random());
        System.out.println("月份：" + month);

        switch (month) {
            case 1:
                System.out.println("一月份，过新年！");
                break;
            case 2:
                System.out.println("二月份，开春了");
                break;
            default:
                System.out.println("其他月份");
                break;
        }

        char c = 'a';
        int rand = (int) (26 * Math.random());
        char c2 = (char) (c + rand);
        System.out.print(c2 + ": ");
        switch (c2) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("元音");
                break;
            case 'y':
            case 'w':
                System.out.println("半元音");
                break;
            default:
                System.out.println("辅音");
        }
    }
}