import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1874 {
    public static void main(String[] args) throws IOException {
        solution();
    }


    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int start = 0;

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // N 번 반복
        for (int i=0; i<arr.length; i++){
            int value = arr[i];
            if (start < value) {
                for (int j=start + 1; j<=value; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                start = value; // 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
            } else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}
