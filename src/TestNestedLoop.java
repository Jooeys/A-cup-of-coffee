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
        System.out.println("*****************************");
        //用while循环分别计算100以内的奇数以及偶数的和，并输出
        int SumOddNumber =0;
        int SumEvenNumber = 0;
        for(int i=1;i<=100;i++) {
            if (i % 2 == 0) {
                SumEvenNumber += i;
            } else {
                SumOddNumber += i;
            }
        }
        System.out.println("奇数和："+SumOddNumber);
        System.out.println("偶数和："+SumEvenNumber);

        System.out.println("******************************");
        //用while循环或者其他循环输出1-1000之间能被5整除的数，且每行输出5个
        int k=0;
        for (int j =1;j<=1000;j++){
            if (j%5==0){
                System.out.print(j+"\t");
                k++;
            }
//            if (j%25==0){
//                System.out.println();
//            }
            if(k==5){
                System.out.println();
                k=0;
            }
        }
        }
    }
