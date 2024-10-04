package 에어컨만들기;

import java.util.Scanner;

public class SmartAirCon extends AirCon {
    private boolean isAutoMode;

    public  SmartAirCon() {
        isAutoMode = false;
    }

    public void setAutoMode(boolean autoMode) {
        isAutoMode = autoMode;
    }
    @Override
    public void airConInfo() {
        super.airConInfo();
        String autoModeStr = isAutoMode ? "ON" : "OFF";
        System.out.println("자동 온도 조절 : " + autoModeStr);
    }
    // 자동 온도 조절 기능 구현, 설정 온도를 20도로 자동 지정해서 동작 하도록
    @Override
    public void setAirConState() {
        if(isAutoMode) {
            windStep = 2;
            setTemp = 20;
            if (curTemp > setTemp) {  // 현재가 더운 상태, 온도를 내리라는 의미
                System.out.println("Cooler가 동작 합니다.");
                isCooler = true;
                isHeater = false;
            } else if (curTemp < setTemp) { // 현재가 추운 상태, 온도를 높이라는 의미
                isCooler = false;
                isHeater = true;
            } else {
                isCooler = false;
                isHeater = false;
            }
            System.out.println("자동 모드 온도 조정 : " + setTemp);
        }
    }


}
