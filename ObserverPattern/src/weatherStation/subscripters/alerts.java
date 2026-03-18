package weatherStation.displays;

import weatherStation.interfaces.Observer;
import weatherStation.interfaces.Subject;
import weatherStation.interfaces.DisplayElement;

// alertas inmediatas sobre fallas o mantenimiento requerido en estaciones o vehículos.

public class alerts implements Observer, DisplayElement {
    private float ne_wElectricVehicleArrived, changesDueToMaintainment;
    private String interruptionOfService;
    
    public alerts(Subject station) {
        station.registerObserver(this);
    }
    
    public void update(float ne_wElectricVehicleArrived, float changesDueToMaintainment, String interruptionOfService) {
        this.ne_wElectricVehicleArrived = ne_wElectricVehicleArrived;
        this.changesDueToMaintainment = changesDueToMaintainment;
        this.interruptionOfService = interruptionOfService;
    }
    
    public void display() {
        System.out.println();
        System.out.println("=== Alertas ===");
        System.out.println("  LLegada de nuevo vehícul eléctrico: " + String.format("%.1f", ne_wElectricVehicleArrived));
        System.out.println("  Cambios debido a mantenimiento: " + String.format("%.1f", changesDueToMaintainment));
        System.out.println("  Interrupción del Servicio: " + String.format("%.1f", interruptionOfService));
    }
}
