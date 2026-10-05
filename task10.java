public class task10 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);

        int count;

        count = 0;
        if (a > b) count++;
        if (a > c) count++;
        if (a > d) count++;
        if (a > e) count++;

        if (count == 2) {
            System.out.println(a);
        }

        count = 0;
        if (b > a) count++;
        if (b > c) count++;
        if (b > d) count++;
        if (b > e) count++;

        if (count == 2) {
            System.out.println(b);
        }

        count = 0;
        if (c > a) count++;
        if (c > b) count++;
        if (c > d) count++;
        if (c > e) count++;

        if (count == 2) {
            System.out.println(c);
        }

        count = 0;
        if (d > a) count++;
        if (d > b) count++;
        if (d > c) count++;
        if (d > e) count++;

        if (count == 2) {
            System.out.println(d);
        }

        count = 0;
        if (e > a) count++;
        if (e > b) count++;
        if (e > c) count++;
        if (e > d) count++;

        if (count == 2) {
            System.out.println(e);
        }
    }
}
