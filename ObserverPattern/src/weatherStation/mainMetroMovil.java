package weatherStation;

import weatherStation.data.WeatherData;
import weatherStation.events,*;
import weatherStation.subscripters.*;
import java.util.Scanner;

public class mainMetroMovil {
    public static void main(String[] args) {
        MetroMovil station = new MetroMovil();
        Scanner scanner = new Scanner(System.in);
        
        realTimeAdjustments movilityCoordinator = new realTimeAdjustments(station);
        SendUpdates communicationsResponsable = new SendUpdates(station);
        alerts technicalSuperviser = new alerts(station);
        
        System.out.println("=== Metro Movil ===\n");
        
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Informes para ajustar rutas en tiempo real");
            System.out.println("2. Enviar boletines y actualizaciones en redes sociales");
            System.out.println("3. Alertas inmmediatas sobre fallas y cambios en el servicio");
            System.out.println("0. Salir");
            System.out.print("Seleccionar: ");
            
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                System.out.println("Bye!");
                break;
            }
            
            switch (choice) {
                case 1:
                    movilityCoordinator.display();
                    break;
                case 2:
                    communicationsResponsable.display();
                    break;
                case 3:
                    technicalSuperviser.display();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}
