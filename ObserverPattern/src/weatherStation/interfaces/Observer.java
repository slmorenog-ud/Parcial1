package weatherStation.interfaces;

public interface Observer {
    void update(float ne_wElectricVehicleArrived, float changesDueToMaintainment, String interruptionOfService);
}