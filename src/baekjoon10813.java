import java.util.Scanner;

public class baekjoon10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,num2;
        do {
            num = sc.nextInt();
            num2 = sc.nextInt();
        }while(!(num <= 100 && num >=1) && (num2 <= 100 && num2 >=1));
        int[] array = new int[num];
        for(int i=0;i<num;i++){
            array[i] = i+1;
        }

        for(int z=0;z<num2;z++) {
            int i=sc.nextInt(), j=sc.nextInt();
            i--;j--;
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        for(int i=0;i<num;i++){
            System.out.printf("%d ",array[i]);
        }


    }
}
