import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q11729V2 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int circle = sc.nextInt();
        sb.append((int)Math.pow(2,circle) - 1).append("\n");
        hanoi("1","2","3",circle);
        System.out.println(sb);

    }

    private static void hanoi(String from, String middle, String to, int circleNumber) {
        // 이동할 원반의 수가 1개라면?
        if (circleNumber == 1) {
            sb.append(from + " " + to + "\n");
            return;
        }

        if (circleNumber == 0)
            return;
        hanoi(from, to, middle,circleNumber - 1);
        sb.append(from + " " + to + "\n");
        hanoi(middle, from, to, circleNumber - 1);
    }
}
