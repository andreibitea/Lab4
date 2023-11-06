package ex2;

public class P2 {
    public static void main(String[] args) {
        int nr = 254;
        int s = sumCfr(nr);
        System.out.println("sum is " + s);
    }
    public static int sumCfr(int nr) {
        int s = 0;
        while (nr != 0) {
            int c = nr % 10;
            s += c;
            nr /= 10;
        }
            return s;
    }
}
