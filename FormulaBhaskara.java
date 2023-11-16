import java.util.Scanner;

public class FormulaBhaskara {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Informe o coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.printf("Informe o coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.printf("Informe o coeficiente c: ");
        double c = scanner.nextDouble();

        double delta = (Math.pow(b, 2) - (4 * a * c));

        double x1 = (-b + Math.sqrt(delta)/(2 * a));
        double x2 = (-b - Math.sqrt(delta)/(2 * a));

        System.out.printf(" O delta é %.2f %n", delta );
        System.out.printf (" Com x1 é igual %.2f %n", x1);
        System.out.printf(" E x2 é igual a %.2f %n", x2);

    }

}
