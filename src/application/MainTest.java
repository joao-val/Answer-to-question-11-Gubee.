package application;

import BatteryUtil.GetBattery;

public class MainTest {
    public static void main(String[] args) {

        GetBattery getBattery = new GetBattery();

        System.out.println("Valor final da bateria: " + getBattery.newBattery());
    }
}
