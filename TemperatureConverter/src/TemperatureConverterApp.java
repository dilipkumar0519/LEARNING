import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the temperature in degree-F");
		double f=scan.nextDouble();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		double tempc= temperatureConverter.convertFahrenheitToCelsius(f);
		System.out.println(tempc);
	}
	

}
