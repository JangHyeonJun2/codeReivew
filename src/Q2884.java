import java.util.Scanner;

/*
    첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
    입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
 */
public class Q2884 {
    public void solution(int H, int M) {
        //변수 확인하기
        if (H < 0 && H > 23)
            return;
        if (M < 0 && M > 59)
            return;

        if (M < 45) {
            if (H == 0){
                H = 23;
            }else
                H -= 1;
            int tmp = 45 - M; //예) M이 10이면 tmp는 35
            M = 60 - tmp;   //예) tmp가 35이니 60 - 35먼저 실행하고 다시 tmp에 담긴다.
            System.out.println(H + " " + M);
        }else if (M >= 45) {
            M -= 45;
            System.out.println(H + " " + M);
        }
    }

    public static void main(String[] args) {
        Q2884 q = new Q2884();
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        q.solution(H,M);
    }
}
