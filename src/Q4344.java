import java.util.Scanner;

public class Q4344 {
    public void solution(int[] intArr, int sum) {//intArr은 학생들 성적
        int avg = sum / intArr.length;
        int count = 0;
        for (int i=0; i<intArr.length; i++) {
            if (intArr[i] > avg)
                count++;
        }
        float percentValue = (float) count / (float) intArr.length * 100;
//        System.out.format("%.3%n", percentValue);
        System.out.printf("%.3f%%%n",percentValue);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q4344 q = new Q4344();
        int loopNum = sc.nextInt(); //테스트 케이스 갯수

        for (int i=0; i<loopNum; i++) {
            int studentNum = sc.nextInt(); //학생들 숫자
            int[] recordArr = new int[studentNum];
            int sum = 0;

            for (int j=0; j<studentNum; j++) {
                recordArr[j] = sc.nextInt(); //학생들 성적 입력
                sum+=recordArr[j];
            }
            q.solution(recordArr,sum);
        }
    }
}
