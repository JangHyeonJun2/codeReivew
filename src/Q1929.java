import java.util.Scanner;

public class Q1929 {
    public void solution(int M, int N) {
        for (int i=M; i<=N; i++) {
            if (i == 0 || i == 1)
                continue;
            if (!isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private boolean isPrime(int m) {
        for (int i=2; i<=(int)Math.sqrt(m); i++) {
            if (m % i == 0)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        Q1929 q = new Q1929();

        q.solution(M,N);
    }
}
