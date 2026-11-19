/*Add Phidgets Library | You added a file called phidget22 when configuring your project. 
Import gives you access to the Phidgets library code inside that file.*/
import com.phidget22.*;

public class TugOfWar {
/*Handle Exceptions | Exceptions will happen in your code from time to time.*/
	public static void main(String[] args) throws Exception{

		/*Create | Here you've created a DigitalOutput object*/
		//LEDs
		DigitalOutput redLED = new DigitalOutput();
		DigitalOutput greenLED = new DigitalOutput();
		//Buttons
		DigitalInput redButton = new DigitalInput();
		DigitalInput greenButton = new DigitalInput();

		/*Address | This tells your program where to find the device you want to work with.*/
		//LEDs
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);
		//Buttons
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);

		/*Open | Open establishes a connection between your object and your physical Phidget.*/
		//LEDs
		redLED.open(1000);
		greenLED.open(1000);
		//Buttons
		redButton.open(1000);
		greenButton.open(1000);

		/*Use your Phidgets */
		while(true){
			redLED.setState(true);
			greenLED.setState(true);
			Thread.sleep(2000);
			redLED.setState(false);
			greenLED.setState(false);
			Thread.sleep(1000);
		if(redButton.getState()){
			System.out.println("red Button State: " + redButton.getState());}
		if(greenButton.getState()){
			System.out.println("green Button State: " + greenButton.getState());}
			Thread.sleep(150);
		if (redButton.getState()){
			for (int j = 1; j <= 6; j++) {
				redLED.setState(true);
				Thread.sleep(150);
				redLED.setState(false);
				Thread.sleep(150);
		}
		}else if (greenButton.getState()){
			for (int j = 1; j <= 6; j++) {
				greenLED.setState(true);
				Thread.sleep(150);
				greenLED.setState(false);
				Thread.sleep(150);
		}
		}
		}
	}
}