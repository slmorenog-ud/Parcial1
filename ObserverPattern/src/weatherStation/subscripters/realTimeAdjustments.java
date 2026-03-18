package weatherStation.displays;

import weatherStation.interfaces.Observer;
import weatherStation.interfaces.Subject;
import weatherStation.interfaces.DisplayElement;

// Ajustar en tiempo real las rutas

public class realTimeAdjustments implements Observer, DisplayElement {
    private float ne_wElectricVehicleArrived, changesDueToMaintainment;
    private String interruptionOfService;
}

    public realTimeAdjustments(Subject station) {
        station.registerObserver(this);
    }
    
    public void display() {
        System.out.println();
        System.out.println("=== Ajustes en Tiempo Real de las Rutas ===");
        System.out.println("  Ajuste de tiempo real : " + String.format("%.1f", ne_wElectricVehicleArrived));
        System.out.println("  Ajuste tiempo real para: " + String.format("%.1f", changesDueToMaintainment));
        System.out.println("  Ajuster tiem,po real " + String.format("%.1f", interruptionOfService));
    }

    public void update(float ne_wElectricVehicleArrived, float changesDueToMaintainment, String interruptionOfService) {
        this.ne_wElectricVehicleArrived = ne_wElectricVehicleArrived;
        this.changesDueToMaintainment = changesDueToMaintainment;
        this.interruptionOfService = interruptionOfService;
}

}