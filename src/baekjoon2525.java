import java.util.Scanner;

public class baekjoon2525 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num,num2,num3;
        do {
            num = sc.nextInt();
            num2 = sc.nextInt();
            num3 = sc.nextInt();
        } while (!(0 <= num && num <= 23) && (0 <= num2 && num2 <= 59) && (0 <= num && num <= 1000));  // 지정된 범위 외의 값 거부


        if (num2 + num3 > 60) {
            if(num != 23){
                num++;
            }else {
                num = 0;
            }
            num3 = num3 - (60 - num2);
            num2 = 0; // 18 0 60
        }else{
            num2 = num2+num3;
        }
        if (num3 < 60){
            num2 = num3;
        }
        while (num3 >= 60){
            if(num != 23){
                num++;
            }else {
                num = 0;
            }
            num3 = num3 - 60;

        }
        System.out.printf("%d %d",num,num2);
    }
}


//
//    int min = 60 * a + b;
//        min += c;
//                a = min/60 % 24;
//                b = min % 60;