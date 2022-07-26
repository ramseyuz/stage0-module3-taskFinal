package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float temp=(float) ((9f/5f)*temperatureCelsius)+32f;
        System.out.println(temp);
    }
}
