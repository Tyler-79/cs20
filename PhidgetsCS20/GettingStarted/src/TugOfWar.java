/*Add Phidgets Library | You added a file called phidget22 when configuring your project. 
Import gives you access to the Phidgets library code inside that file.*/
import java.util.Scanner;

import com.phidget22.*;

public class TugOfWar {
/*Handle Exceptions | Exceptions will happen in your code from time to time.*/
	public static void main(String[] args) throws Exception{
		while(true) {
		/*tracks the amount of time the buttons are pressed and if they are pressed*/
		int redCount = 0;
		int greenCount = 0;
		
		boolean redPressed = false;
		boolean greenPressed = false;
		
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
		while(redCount < 10 && greenCount < 10) {

		    // Check red button
		    if(redButton.getState() && !redPressed) {
		        redCount++;
		        redPressed = true;
		        System.out.println("Red: " + redCount);
		    }

		    if(!redButton.getState()) {
		        redPressed = false;
		    }

		    // Check green button
		    if(greenButton.getState() && !greenPressed) {
		        greenCount++;
		        greenPressed = true;
		        System.out.println("Green: " + greenCount);
		    }

		    if(!greenButton.getState()) {
		        greenPressed = false;
		    }

		    Thread.sleep(20);
		}// Both LEDs flash once
		redLED.setState(true);
		greenLED.setState(true);
		Thread.sleep(1500);

		redLED.setState(false);
		greenLED.setState(false);
		Thread.sleep(1000);

		// Red player wins
		if(redCount == 10) {
		    System.out.println("RED PLAYER WINS!");

		    for(int j = 1; j <= 5; j++) {
		        redLED.setState(true);
		        Thread.sleep(150);
		        redLED.setState(false);
		        Thread.sleep(150);
		    }
		}

		// Green player wins
		else if(greenCount == 10) {
		    System.out.println("GREEN PLAYER WINS!");

		    for(int j = 1; j <= 5; j++) {
		        greenLED.setState(true);
		        Thread.sleep(150);
		        greenLED.setState(false);
		        Thread.sleep(150);
		    }
		}break;
		}
	}
}