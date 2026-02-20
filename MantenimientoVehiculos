import java.util.Scanner;

/*
 *Aplicacion de gestion de mantenimiento para flotas de vehiculos.
 *Calcula si un vehiculo requiere revision segun su kilometraje
 */

public class MantenimientoVehiculos{
    
    public static void main(String[] args){
        
        //--CONFIGURACION Y VARIABLES--
        final int LIMITE_KILOMETROS = 15000;
        int kilometrosActuales;
        String idVehiculo;
        Scanner sc = new Scanner(System.in);

        //--ENTRADA DE DATOS--
        System.out.println("====================================");
        System.out.println("  SISTEMA DE MANTENIMIENTODE FLOTA  ");
        System.out.println("====================================");

        System.out.println("=> Introduce el ID de tu vehiculo: ");
        idVehiculo = sc.nextLine();

        System.out.println("=> Introduce los kilometros actuales: ");
        kilometrosActuales = sc.nextInt();

        //--LOGICA Y RESULTADOS--
        System.out.println("\n-------------------------------------");
        System.out.println("RESULTADO DEL DIAGNOSTICO");

        if (kilometrosActuales >= LIMITE_KILOMETROS) {
            System.out.println("¡ALERTA! El vehiculo " + idVehiculo+ ", ha superado el limite.");
            System.out.println("ACCION: Acudir al taller inmediatamente.");
        } else {
            System.out.println("ESTADO: El vehiculo " + idVehiculo + " esta en buen estado.");
            System.out.println("INFO: Faltan" + (kilometrosActuales - LIMITE_KILOMETROS)+ 
            " km para la proxima revision.");

            System.out.println("\n-------------------------------------");
        }

        //--CERRAMOS EL SCANNER--
        sc.close();
    }
