import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int b = 0;
        System.out.println("digite ");
        b = sc.nextInt();
        System.out.println(b);
        sc.close();
    }
}
