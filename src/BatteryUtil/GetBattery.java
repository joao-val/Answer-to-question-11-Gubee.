package BatteryUtil;

public class GetBattery {


    private int[] events = new int[]{10, -20, 61, -15};
    private Integer sum = 50;

    public GetBattery(){
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer newBattery() {
        for (int i = 0; i < events.length; i++) {
            sum += events[i];
            if (sum > 100) {
                sum = 100;
            } else if (sum < 0) {
                sum = 0;
            }
        }
        return sum;
    }
}
