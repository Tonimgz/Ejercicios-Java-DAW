import java.util.Scanner;

/**
 * Ejercicio de lógica básica: Calculador de presupuestos de instalación.
 * Este programa solicita datos de metros y tipo de material para devolver un coste estimado.
 */
public class CalculadorPresupuesto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Precios por metro cuadrado según material
        final double PRECIO_ESTANDAR = 25.0;
        final double PRECIO_PREMIUM = 45.0;

        System.out.println("--- Gestor de Presupuestos Técnicos ---");
        
        System.out.print("Introduce los metros cuadrados de la instalación: ");
        double metros = sc.nextDouble();

        System.out.print("Tipo de tela (1: Estándar, 2: Premium): ");
        int tipo = sc.nextInt();

        double precioBase = (tipo == 2) ? PRECIO_PREMIUM : PRECIO_ESTANDAR;
        double total = metros * precioBase;

        System.out.println("\n--- Resumen del Presupuesto ---");
        System.out.printf("Superficie: %.2f m2\n", metros);
        System.out.printf("Precio/m2: %.2f €\n", precioBase);
        System.out.println("-------------------------------");
        System.out.printf("TOTAL ESTIMADO: %.2f €\n", total);
        
        sc.close();
    }
}
