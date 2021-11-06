import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner epic = new Scanner(System.in);
        Operation hello = new Operation();

        double a = epic.nextDouble();
        double b = epic.nextDouble();
      //  int c = epic.nextInt();
        System.out.println(hello.add(a,b));
    }
}
