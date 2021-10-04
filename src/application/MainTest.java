package application;

import BatteryUtil.Battery;

public class MainTest {
    public static void main(String[] args) {

        int [][] events = new int[][]{{10, -20, 61, -15}, {30, 40, -90, -15}};

        Battery battery = new Battery();

        int result = battery.getBattery(events);

        System.out.println("Valor final da bateria: " + result );
    }
}
