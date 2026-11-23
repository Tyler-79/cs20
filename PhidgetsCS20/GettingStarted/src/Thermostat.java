
//Add Phidgets Library
import com.phidget22.*;

public class Thermostat {
public static void main(String[] args) throws Exception{
	double setTemp = 21;
	
	boolean redPressed = false;
	boolean greenPressed = false;
/*Create*/
	HumiditySensor humiditySensor = new HumiditySensor();
	TemperatureSensor temperatureSensor = new TemperatureSensor();
	DigitalOutput redLED = new DigitalOutput();
	DigitalOutput greenLED = new DigitalOutput();
	DigitalInput redButton = new DigitalInput();
	DigitalInput greenButton = new DigitalInput();
	
	/*Address | This tells your program where to find the device you want to work with.*/
	redLED.setHubPort(1);
	redLED.setIsHubPortDevice(true);
	greenLED.setHubPort(4);
	greenLED.setIsHubPortDevice(true);
	redButton.setHubPort(0);
	redButton.setIsHubPortDevice(true);
	greenButton.setHubPort(5);
	greenButton.setIsHubPortDevice(true);

/*Open*/
	humiditySensor.open(1000);
	temperatureSensor.open(1000);
	redLED.open(1000);
	greenLED.open(1000);
	redButton.open(1000);
	greenButton.open(1000);

//Use your Phidgets
	while(true){
		//System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
		if(redButton.getState() && !redPressed) {
			setTemp--;
	        redPressed = true;
	        System.out.println("New temp set: " + setTemp + "˚C" + " current room temperature: " + temperatureSensor.getTemperature() + "°C");
	    }
		if(!redButton.getState()) {
	        redPressed = false;
	    }
		if(greenButton.getState() && !greenPressed) {
			setTemp++;
		     greenPressed = true;
		     System.out.println("New temp set: " + setTemp + "˚C" + " current room temperature: " + temperatureSensor.getTemperature() + "°C");
		}

		if(!greenButton.getState()) {
			greenPressed = false;
		    }
		
		if (setTemp <= (temperatureSensor.getTemperature() + 2) && setTemp >= (temperatureSensor.getTemperature() - 2)) {
			 greenLED.setState(true);
			 redLED.setState(false);
	         Thread.sleep(1000);
		} else if (temperatureSensor.getTemperature() > (2 + setTemp) || temperatureSensor.getTemperature() < (2 - setTemp)) {
			redLED.setState(true);
			greenLED.setState(false);
            Thread.sleep(1000);
            
		}
}
}
}
  