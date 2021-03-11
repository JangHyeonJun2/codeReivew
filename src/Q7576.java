import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q7576 {

    //상,하,좌,우 이동할 때의 좌표들
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public int solution(int M, int N) throws IOException {
        Queue<Point> queue = new LinkedList<>();
        int[][] arr = new int[N][M];

        makeTomatos(arr,M,N); //토마토 초기화 하기
        findOneLocationIndex(arr,queue);//bfs로 풀기 때문에 큐를 사용한다.
        bfs(queue,arr,M,N);
        return findResultValue(arr);
    }

    private int findResultValue(int[][] arr) {
        int max = 0;
        for (int i=0; i< arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    return -1;

                }
                max = Math.max(max,arr[i][j]);
            }
        }
        return max - 1;//-1을 해주는 이유는 배열에서는 익은 토마토가 있어서 증가한다면 2부터 시작하기 때문에 -1을 해줘야 정상적인 날짜가 나온다.
    }

    private void bfs(Queue<Point> queue,int[][] arr, int M, int N) {
        while(!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i=0; i<4; i++) {
                int newX = point.getX() + dx[i];
                int newY = point.getY() + dy[i];

                //범위 조건식
                if (newX < 0 || newY < 0 || newX >= N || newY >= M)
                    continue;
                //익지않은 토마토가 아니면 패스
                if (arr[newX][newY] != 0)
                    continue;

                //하루를 더 해줘야한다.
                arr[newX][newY] = arr[point.getX()][point.getY()] + 1;
                queue.add(new Point(newX,newY));
            }

//            토마토 밭 출력하는 함수
            print(arr);
            System.out.println();
        }
    }

    private void print(int[][] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    private void findOneLocationIndex(int[][] arr,Queue<Point> queue) {

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    queue.add(new Point(i,j));
                }
            }
        }
    }

    private void makeTomatos(int[][] arr,int M, int N) throws IOException {
        for (int i=0; i<N; i++) {
            String[] number = br.readLine().split(" ");
            for (int j=0; j<M; j++) {
                arr[i][j] = Integer.parseInt(number[j]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String[] str = br.readLine().split(" ");
        int M = Integer.parseInt(str[0]);
        int N = Integer.parseInt(str[1]);

        Q7576 q = new Q7576();

        System.out.println(q.solution(M,N));
    }
}
class Point {
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
