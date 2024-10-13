import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        double a = 0;
        double b = 0;
        double c = 0;


        System.out.print("Podaj pierwszą liczbę: ");
        a = src.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        b = src.nextDouble();

        System.out.print("Podaj trzecią liczbę: ");
        c = src.nextDouble();

        double delta = 0;
            delta = Math.pow(b, 2) - 4 * a * c;
            System.out.print(delta);
                if (delta > 0) {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println(String.format("Miejsca zerowe funkcji: %.2f, %.2f", x1, x2));
                }
                else if (delta == 0) {
                    double x0 = (-b) / 2 * a;
                    System.out.print(String.format("Miejsce zerowe fukcji wynosi: %.2f", x0));
                }
                else if (delta < 0) {
                    System.out.println("Funkcja nie ma miejsc zerowych");
                }







    }
}