import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941 {
    public static void main(String[] args) throws IOException {
        //        크로아티아 문자 : {"c=","c-","dz=","d-","lj","nj","s=","z="}

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {//각 조건문에서 i를 ++해주고 여기에서 한번 더 i++를 해주니 2 or 3번을 해준다.
                                                //그리고 예외적으로 아무것도 만족하지 않는다면 count만 ++해주고 i는 여기에서 1번만 ++해준다.
            char ch = str.charAt(i);
            if(ch == 'c') { // 만약 ch 가 c 라면?
                if(str.charAt(i + 1) == '=') { //만약 ch 다음 문자가 '=' 이라면? // i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
                    i++;
                }
                else if(str.charAt(i + 1) == '-') {
                    i++;
                }
            }
            else if(ch == 'd') {
                if(str.charAt(i + 1) == 'z') {
                    if(str.charAt(i + 2) == '=') { // dz= 일 경우
                        i += 2;
                    }
                }
                else if(str.charAt(i + 1) == '-') { // d- 일 경우
                    i++;
                }
            }
            else if(ch == 'l') {
                if(str.charAt(i + 1) == 'j') { // lj 일 경우
                    i++;
                }
            }
            else if(ch == 'n') {
                if(str.charAt(i + 1) == 'j') { // nj 일 경우
                    i++;
                }
            }
            else if(ch == 's') {
                if(str.charAt(i + 1) == '=') { // s= 일 경우
                    i++;
                }
            }
            else if(ch == 'z') {
                if(str.charAt(i + 1) == '=') { // z= 일 경우
                    i++;
                }
            }
            count++;
        }
        System.out.println(count);




    }
}
