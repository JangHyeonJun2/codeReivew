import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q4949 {
    public String solution(String line)  {
            Stack<Character> stack = new Stack<>();
            for (char ch : line.toCharArray()) {
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                       return "no";//여기서 리턴 false해도 상관없는게 처음부터 ')'이것이 나오면 갯수가 안맞으니깐 상관없음.

                    }else
                        stack.pop();
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        return  "no";//여기서 리턴 false해도 상관없는게 처음부터 ')'이것이 나오면 갯수가 안맞으니깐 상관없음.

                    }
                    else
                        stack.pop();
                }
            }

            if (stack.empty())
                return  "yes";
            else
                return  "no";
    }
    public static void main(String[] args) throws IOException {
        Q4949 q = new Q4949();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = br.readLine();
            if (line.equals("."))//문제에서 말한 종료 조건
                break;

            sb.append(q.solution(line)).append("\n");
        }

        System.out.println(sb);
    }
}
