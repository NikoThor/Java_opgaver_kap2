package Opgave_2_17;

public class Temp {
    int temp;
    int windSpeed;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;

    }

    @Override
    public String toString() {
        return "Temp{" +
                "temp=" + temp +
                ", windSpeed=" + windSpeed +
                '}';
    }
}
