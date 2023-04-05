import java.util.Scanner;

public class baekjoon25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,num2;
        do {
            num = sc.nextInt();
        }while(!(num <= 1000 && num >=4));

        num2 = num / 4;
        //System.out.println(num2);

        for(int i = 0 ; i < num2 ; i++){
            System.out.print("long ");
        }
        System.out.println("int");



    }
}
