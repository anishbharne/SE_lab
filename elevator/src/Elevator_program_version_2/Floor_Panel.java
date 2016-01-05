package Elevator_program_version_2;

import java.io.*;

// Floor panel of the Lift 
public class Floor_Panel {
	private int plFloor;
	
	// constructor
	public Floor_Panel (){
		plFloor = ((int) (Math.random() * 10 + 1));
	}
	
	int getSourceFloor_Passenger() {
		return plFloor;
	}

	void getSourceFloor_Passenger(int n) {
		plFloor = n;
	}	
}
