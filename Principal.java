import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese dos números separados por un espacio: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        scanner.close();

        Calculadora calculadora = new Calculadora();

        int multiplicacionSumas = calculadora.multiplicarUsandoSumas(num1, num2);
        System.out.println("El resultado de la multiplicación usando suma es: " + multiplicacionSumas);

        int multiplicacionDirecta = calculadora.multiplicar(num1, num2);
        System.out.println("La multiplicación es: " + multiplicacionDirecta);
    }
}
