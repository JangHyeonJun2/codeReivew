import java.util.Scanner;

public class Q1110 {
    public void solution(int num1) {
        int tmp = num1;
        int tmpValue = 0;
        int count = 0;

        do {
//            int modulus = num1 / 10; // num1이 26이면 2
//            int quotient = num1 % 10; // num1이 26이면 6
//            tmpValue = modulus + quotient; // 8
//            num1 = (quotient * 10) + (tmpValue % 10); //60 + 8


            num1 = ((num1 % 10) * 10) + ((( num1 / 10 ) + ( num1 % 10 )) % 10);
            count++;
        }while(tmp != num1);


        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q1110 q = new Q1110();

        int num1 = sc.nextInt();

        q.solution(num1);

    }
}
