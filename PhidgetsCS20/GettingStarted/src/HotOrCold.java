//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class HotOrCold {
public static void main(String[] args) throws Exception{
/*Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget. 
* This allows you to access both temperature and humidity data from your Phidget.
*/
	TemperatureSensor temperatureSensor = new TemperatureSensor();
	DigitalInput redButton = new DigitalInput();
    DigitalOutput redLED = new DigitalOutput();
    DigitalInput greenButton = new DigitalInput();
    DigitalOutput greenLED = new DigitalOutput();
    redButton.setHubPort(0);
    redButton.setIsHubPortDevice(true);
    redLED.setHubPort(1);
    redLED.setIsHubPortDevice(true);
    greenButton.setHubPort(5);
    greenButton.setIsHubPortDevice(true);
    greenLED.setHubPort(4);
    greenLED.setIsHubPortDevice(true);

/*Open | Open establishes a connection between your object and your physical Phidget. 
* You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. 
* If your Phidget can't be found, an exception occur.
*/
	temperatureSensor.open(1000);
	redButton.open(100);
    redLED.open(100);
    greenButton.open(100);
    greenLED.open(100);
	

//Use your Phidgets | This code will print temperature read by the sensor every 150ms.
	while(true){
		if (temperatureSensor.getTemperature() > 20 && temperatureSensor.getTemperature() < 24) {
			greenLED.setState(true);
		} else {
			 redLED.setState(true);
		}
			System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
	Thread.sleep(150);
}
}
}
  