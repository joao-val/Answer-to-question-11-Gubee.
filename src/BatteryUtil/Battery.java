package BatteryUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Battery {


    private final int[] events = new int[]{10, -20, 61, -15};
    private Integer status = 50;

    public Integer getBattery(int [][] events ) {
        for (int [] event : events) {
            for (int statusLoad : event) {
                status += statusLoad;
                if (status > 100) {
                    status = 100;
                } else if (status < 0) {
                    status = 0;
                }
            }
        }
        return status;
    }
}
