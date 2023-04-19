import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x = 3.14;
        double y = 10;

        double a = Math.max(y, x); // return higher value
        System.out.println(a);

        double b = Math.abs(y); // return absolute value
        System.out.println(b);

        double c = Math.sqrt(y); // return square root
        System.out.println(c);

        double d = Math.round(x); // return common round
        System.out.println(d);

        double e = Math.ceil(x); // return up round
        System.out.println(e);

        double f = Math.floor(x); // return down round
        System.out.println(f);

        double q;
        double w;
        double r;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter size x");
        q = scanner.nextDouble();
        System.out.println("enter size y");
        w = scanner.nextDouble();

        r = Math.sqrt(Math.pow(q, 2) + Math.pow(w, 2));

        System.out.println("The hypotenus is: " + r);

        scanner.close();
    }
}