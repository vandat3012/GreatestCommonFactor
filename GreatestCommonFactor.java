import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        int a = scanner.nextInt();
        System.out.println("enter b");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("no greatest common factor");
            while (a != b) {
               if (a>b) {
                   a = a -b;
               }else {
                   b = b - a;
               }
            }
        }
        System.out.println("greatest common factor is " + a);
    }
}
