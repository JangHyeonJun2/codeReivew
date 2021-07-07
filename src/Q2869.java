/*
    문제
     - 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
       달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
       달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
    입력
     - 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)

    출력
     - 첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int oneDayUp = Integer.parseInt(st.nextToken()); //하루에 up 수 있느 거리
        int oneDayDown = Integer.parseInt(st.nextToken()); //하루에 down 할 수 있는 거리
        int length = Integer.parseInt(st.nextToken());
        int day = (length - oneDayDown) / (oneDayUp - oneDayDown);

        if ((length - oneDayDown) % (oneDayUp - oneDayDown) != 0) {
            day++;
        }

        System.out.println(day);
    }
}