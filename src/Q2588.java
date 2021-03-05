import java.util.Scanner;

public class Q2588 {
    public void solution(int n, int n2) {
        System.out.println(n*(n2%10));
        System.out.println(n*((n2/10)%10));
        System.out.println(n*(n2/100));
        System.out.println(n*n2);

    }

    public static void main(String[] args) {
        Q2588 q = new Q2588();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n2 = sc.nextInt();

        q.solution(n,n2);
    }
}
