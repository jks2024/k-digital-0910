package 에어컨만들기;

public class PortableAirCon extends AirCon {
    private int batteryLevel; // 배터리 잔량 표시

    public PortableAirCon() {
        batteryLevel = 100;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
