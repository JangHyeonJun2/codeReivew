import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1021 {
    public static int sum = 0;
    public static void main(String[] args) throws IOException {
        //첫 번쨰 줄에서 받아야할 것 : 큐의 크기 , 찾을 원소의 수
        //두 번쨰 줄에서 받아야할 것 : 찾을려고 하는 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        int N = sc.nextInt(); //큐의 크기
        int M = sc.nextInt(); //찾을 원소의 수

        for (int i=0; i<N; i++) {
            deque.add((i+1));
        }

        for (int i=0; i<M; i++) {
            int findNumber = sc.nextInt(); //사용자가 찾고자 하는 숫자 입력
            String str = frontRearFindHowManyNumbers(deque,findNumber); //사용자가 찾고자하는 숫자 기준으로 앞에 숫자가 많으면 "front" return 뒤에 숫자가 많으면 "Rear"

            if (str.equals("Front"))
                frontMoving(deque,findNumber);
            else
                rearMoving(deque,findNumber);
        }
        System.out.println(sum);
    }

    private static void rearMoving(Deque<Integer> deque,int findNumber) {
        while (deque.peek() != findNumber) {
            int movingValue = deque.pollLast();
            deque.addFirst(movingValue);
            sum += 1;
        }
        deque.pollFirst(); //현재 위치에 사용자가 원하는 숫자가 오면 빼준다.
    }

    private static void frontMoving(Deque<Integer> deque, int findNumber) {

        while (deque.peek() != findNumber) {
            int movingValue = deque.pollFirst();
            deque.addLast(movingValue);
            sum += 1;
        }
        deque.pollFirst();
    }

    private static String frontRearFindHowManyNumbers(Deque<Integer> deque, int findNumber) {
        List<Object> list = Arrays.asList(deque.toArray());
        int findNumberIndex = list.indexOf(findNumber);
        if (findNumberIndex <= deque.size() - findNumberIndex)
            return "Front"; //여기서 중요한게 findNumberIndex가 만약에 1이고 deque.size가 10이면 findNumberIndex 기준으로 앞에 숫자가 1개 있는거고 뒤에 9개의 숫자가 있으니 front로
                            //이동해야하니 front를 return해준다. 밑에도 같은 이유이다.
        else
            return "Rear";
    }
}
