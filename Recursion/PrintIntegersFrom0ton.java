
public class PrintIntegersFrom0ton {
    static int count = 0;

    public static void print(int n) {

        if (n == 0)
            return;

        print(n - 1);
        System.out.print(n + " ");

    }

    public static void print2(int n) {

        if (n == 0)
            return;

        System.out.print(n + " ");

        print(n - 1);

    }

    public static void print3(int n) {

        if (n > 0) {
            System.out.print(n + " ");
            print3(n - 1);
        }

    }

    public static void print4(int n) {

        if (count == n)
            return;

        count++;
        System.out.print(count + " ");
        print4(n);

    }

    public static void main(String[] args) {
        // int n = 5;

        print(5);
        System.out.println();
        System.out.println("----");

        print2(5);
        System.out.println();
        System.out.println("----");

        print3(5);
        System.out.println();
        System.out.println("----");

        print4(5);
    }

}
