package weatherStation.data;

import weatherStation.interfaces.Observer;
import weatherStation.interfaces.Subject;

public class MetroMovil implements Subject {
    private Observer[] observers = new Observer[10];
    private int count = 0;
    private float ne_wElectricVehicleArrived, changesDueToMaintainment;
    private String interruptionOfService;
}
    
    public void registerObserver(Observer o) {
        observers[count++] = o;
    }
    
    public void removeObserver(Observer o) {
        // No implementado a detalle para simplificar
    }

    public void notifyObservers() {
        for (int i = 0; i < count; i++) {
            observers[i].update(ne_wElectricVehicleArrived, changesDueToMaintainment, interruptionOfService);
        }
    }
    
    public void setMeasurements(float newElectricVehicleArrived, float changesDueToMaintainment, float interruptionOfService) {
        this.ne_wElectricVehicleArrived = newElectricVehicleArrived;
        this.changesDueToMaintainment = changesDueToMaintainment;
        this.interruptionOfService = interruptionOfService;
        notifyObservers();
    }
}