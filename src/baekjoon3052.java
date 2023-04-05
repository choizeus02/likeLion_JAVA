import java.util.Scanner;

public class baekjoon3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = new int[10];
        int num,count=0;
        for (int i=0;i<10;i++){
            do {
                num = sc.nextInt();
            }while(!(num <=1000 && num >=0));
            array[i] = num%42;
        }
        for(int i=0;i<array.length;i++){
            boolean bl = false;
            for(int j=i+1;j<array.length;j++){
                if(array[i] == array[j]) {
                    bl = true;
                    break;
                }
            }
            if(bl==false){
                count++;
            }
        }
        System.out.println(count);



    }
}
