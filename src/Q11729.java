import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Q11729 {
    private int count = 0;
    private List<Position> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q11729 q = new Q11729();
        q.hanoi("A","B","C",sc.nextInt());
        Iterator<Position> iterator = q.list.iterator();
        System.out.println(q.count);
        while (iterator.hasNext()) {
            iterator.next().display();
        }
    }

    private void hanoi(String from, String middle, String to, int circleNumber) {
        if (circleNumber == 0)
            return;
        hanoi(from, to, middle,circleNumber - 1);
//        System.out.println(from + " " + to);
        list.add(new Position(from,to)); count++;
        hanoi(middle, from, to, circleNumber - 1);
    }


}
class Position {
    private String f;
    private String t;

    public Position(String f, String t) {
        this.f = f;
        this.t = t;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public void display() {
        System.out.println(this.f + " " + this.t);
    }
}
