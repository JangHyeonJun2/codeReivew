import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Q10250Test {
    Q10250 q = new Q10250();
    @Test
    public void hotelTest() {
        Assertions.assertEquals(402,q.solution(6,12, 10));
    }
}