import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int count = 0;

        if (num1 > 0) {
            count++;
        }
        if (num2 > 0) {
            count++;
        }
        if (num3 > 0) {
            count++;
        }

        System.out.println(count == 1);
    }
}