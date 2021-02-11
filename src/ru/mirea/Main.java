package  ru.mirea;
    import java.util.Comparator;
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        x = sc.nextInt();
        System.out.println("Enter second number");
        y = sc.nextInt();
        Comparator <Integer> comparator = (a, b) -> (a>b) ? a: b;
        System.out.println("highest score: ");
        System.out.print(comparator.compare(x, y));
    }
}