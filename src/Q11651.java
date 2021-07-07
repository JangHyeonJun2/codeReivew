import java.io.IOException;
import java.util.*;

public class Q11651 implements Comparable<Q11651> {
    private int x;
    private int y;

    public Q11651(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Q11651 o) {
        if (this.y > o.y)
            return 1;
        else if (this.y == o.y) {
            return this.x - o.x;
        }else
            return 0;
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

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Q11651> list = new ArrayList<>();

        int testCase = sc.nextInt();
        for (int i=0; i<testCase; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Q11651(x,y));
        }

        Collections.sort(list,new ClassComp());

        for (Q11651 q : list) {
            System.out.println(q.getX() + " " + q.getY());
        }
    }
}

class ClassComp implements Comparator<Q11651> {
    @Override
    public int compare(Q11651 o1, Q11651 o2) {
        if (o1.getY() > o2.getY())
            return 1;
        else if (o1.getY() == o2.getY()){
            return o1.getX() - o2.getX();
        }else
            return -1;
    }
}

























