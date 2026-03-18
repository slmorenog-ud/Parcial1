package weatherStation.displays;

import weatherStation.interfaces.Observer;
import weatherStation.interfaces.Subject;
import weatherStation.interfaces.DisplayElement;

// enviar actualizaciones boletines y actualizaciones en redes sociales sobre las novedades del sistema.

public class SendUpdates implements Observer, DisplayElement {
    private float ne_wElectricVehicleArrived, float changesDueToMaintainment;
    private String interruptionOfService;
}
    public SendUpdates(Subject station) {
        station.registerObserver(this);
    }
    
    public void display() {
        System.out.println();
        System.out.println("=== Actualizaciones para Redes Sociales sobre las novedades del sistema ===");
        System.out.println("  Mira los nuevos buses eléctricos de MetroMovil (Instagram): " + String.format("%.1f", ne_wElectricVehicleArrived));
        System.out.println("  Se llevarán a cabo los siguientes cambios (WhatsApp): " + String.format("%.1f", changesDueToMaintainment));
        System.out.println("  ¡Agéndate! Estos servicios estarán en mantenimiento (WhatsAPP): " + String.format("%.1f", interruptionOfService));
    }

    public void update(float ne_wElectricVehicleArrived, float changesDueToMaintainment, String interruptionOfService) {
        this.ne_wElectricVehicleArrived = ne_wElectricVehicleArrived;
        this.changesDueToMaintainment = changesDueToMaintainment;
        this.interruptionOfService = interruptionOfService;
}
