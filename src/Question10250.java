import java.util.Scanner;

public class Question10250 {
    public int solution(int H, int W, int N) {//H : 호텔 높이 , W : 호텔 너비, N : 몇번쨰 손님
        int[][] hotel = new int[H][W];
        int widthLength = hotel[0].length;
        int heightLength = hotel.length;
        int nCount = 0; //몇 번쨰 손님인지 카운팅
        int wIndex, hIndex;
        for (int i=0; i<widthLength; i++) {
            wIndex = i+1;
            for (int j=0; j<heightLength; j++) {
                ++nCount;
                if (nCount == N) {
                    hIndex = j+1;
                    return makeRoom(wIndex, hIndex);
                }
            }
        }

        return -1;
    }

    private int makeRoom(int wIndex, int hIndex) {
        int result = 0;
        result = (hIndex * 100) + wIndex;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q10250 q = new Q10250();
        int testCase = sc.nextInt();

        for (int i=0; i<testCase; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();


            System.out.println(q.solution(H,W,N));
        }
    }
}
