import java.util.Scanner;

public class Q11729V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hanoi("1","2","3",sc.nextInt());
    }

    private static void hanoi(String from, String middle, String to, int circleNumber) {
        if (circleNumber == 0)
            return;
        hanoi(from, to, middle,circleNumber - 1);
        System.out.println(from + " " + to);
        hanoi(middle, from, to, circleNumber - 1);
    }
}
