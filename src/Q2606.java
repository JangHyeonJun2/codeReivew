import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q2606 {
    public static Scanner sc = new Scanner(System.in);
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int solution(int cn, int nn) throws IOException {
        int[][] computers = eachComputerNetworkAppear(cn,nn);
        boolean[] visited = new boolean[cn];
        int count = 0;
        for (int i=0; i<1; i++) {
            if (!visited[i]) {
                dfs(i,computers,visited,count);
            }
        }
        for (int i=0; i<visited.length;i ++) {
            if(visited[i]) {
                count++;
            }
        }
        return count;
    }

    private void dfs(int c, int[][] computers, boolean[] visited, int count) {

        Stack<Integer> stack = new Stack<>();
        stack.push(c);

        while (!stack.isEmpty()) {
            int num = stack.pop();

            for (int j=0; j<computers[num].length; j++) {
                if (computers[num][j] == 1 && !visited[j]) {
                    stack.push(j);
                    visited[j] = true;
                }
            }
        }
    }

    //서로 컴퓨터에서 연결된 네트워크를 2차원 배열로 나타내기
    private int[][] eachComputerNetworkAppear(int cn,int nn) throws IOException {

        int c1,c2;
        int[][] computers = new int[cn][cn];

        for (int i =0; i<nn; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            c1 = Integer.parseInt(st.nextToken());
            c2 = Integer.parseInt(st.nextToken());
            computers[c1 - 1][c2 - 1] = 1;
        }


        return computers;
    }

    public static void main(String[] args) throws RuntimeException, IOException {
        //첫 번째 줄에는 컴퓨터의 갯수를 받아야하고 :
        //두 번째 줄에는 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수 :
        int computerNumber = sc.nextInt();
        int networkNumber = sc.nextInt();

        Q2606 q = new Q2606();
        int solution = q.solution(computerNumber, networkNumber);
        System.out.println(solution);
    }
}
