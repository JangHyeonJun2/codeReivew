import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] splits = br.readLine().toUpperCase().split("");
        boolean[] visited = new boolean[splits.length];
        int count;
        int max = 0;
        String maxStr = "";

        for (int i=0; i<splits.length; i++) {
            count = 0;
            if (!visited[i]) {
                String str = splits[i];
                for (int j=i; j<splits.length; j++) {
                    if (str.equals(splits[j])) {
                        visited[j] = true;
                        count++;
                    }
                }
                if (count > max) {
                    maxStr = splits[i];
                    max = count;
                }else if (count == max) {
                    maxStr = "?";
                }
            }
        }
        System.out.println(maxStr);
        

//        int[] arr = new int[26]; // 영문자의 개수는 26개임
//        String s = br.readLine();
//        for (int i = 0; i < s.length(); i++) {
//            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
//                arr[s.charAt(i) - 97]++;
//            } else {
//                arr[s.charAt(i) - 65]++;
//            }
//        }
//        int max = -1;
//        char ch = '?';
//        for (int i = 0; i < 26; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                ch = (char) (i + 65);
//            }
//            else if (arr[i] == max) {
//                ch = '?';
//            }
//        }
//        System.out.print(ch);
    }
}
