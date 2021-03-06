
public class Q4673 {
    public static void main(String[] args) {
        boolean[] isNotSelfNumber = new boolean[10001]; // 구해야한느 값이 1 - 10000
        for (int i=1; i<=10000; i++) {
            int num = findSelfNumber(i);

            if (num < 10001) {
                isNotSelfNumber[num] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<isNotSelfNumber.length; i++) {
            if (!isNotSelfNumber[i])
                sb.append(i).append('\n');
        }

        System.out.print(sb);
    }

    private static int findSelfNumber(int number) {
        int tmpNumber = number; //매개변수로 들어온 숫자는 안건드리는게 좋다.
        int tmpSum = tmpNumber; //여기 부부 조심!!! 처음에 tmpSum을 매개변수로 들어온 인자로 초기화를 해줘야한다.

        while (tmpNumber != 0) {
            tmpSum = tmpSum + (tmpNumber % 10); //일의 자리수가 나온다.
            tmpNumber = tmpNumber/10; //몫을 꺼낸다.
        }
        return tmpSum;
    }
}
