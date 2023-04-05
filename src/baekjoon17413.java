import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = bf.readLine();

        Stack<Character> stack = new Stack<>();
        int len = str.length();

        boolean tag = false;
        for(int i=0;i<len;i++){
            if(str.charAt(i) == '<'){
                tag =true;
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                sb.append(str.charAt(i));
            } else if (str.charAt(i) == '>') {
                tag = false;
                sb.append(str.charAt(i));
            } else if (tag == true) {
                sb.append(str.charAt(i));
            } else if (tag == false) {
                if(str.charAt(i) == ' '){
                    while(!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(str.charAt(i));
                }else {
                    stack.push(str.charAt(i));
                }

            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb);





    }
}
