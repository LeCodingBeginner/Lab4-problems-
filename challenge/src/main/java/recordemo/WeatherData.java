package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return temperatureCelsius*(9.0/5) +32;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather: %.1f C (%.1fF) and %s",this.temperatureCelsius,this.temperatureFahrenheit(),this.conditions);
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
       // let's convert the Fahrenheit to Celsius:
        double celsius = (tempFahrenheit-32)*5.0/9;
        WeatherData w = new WeatherData(celsius,conditions);
        return w;
    }

    public static void main(String[] args) {
        WeatherData w = WeatherData.fromFahrenheit(77.0,"Sunny");
        System.out.println(w.getSummary());
    }}
