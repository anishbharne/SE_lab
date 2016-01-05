package Elevator_program_version_2;

import java.io.*;
public class Lift_Class {
	public int sourceFloor;                       // Floor at which the lift is present currently
	public int SourceFloor_Passenger;             // Floor at which the passenger is present  
	public int Top_Most_Floor = 10;               // Total Number of floors present for the building is 10
	public int DestinationFloor;                  // Floor which the passenger desires to go
	
	// generating getters
	public int getSourceFloor() {
		return sourceFloor;
	}

	public int getSourceFloor_Passenger() {
		return SourceFloor_Passenger;
	}

	public int getTop_Most_Floor() {
		return Top_Most_Floor;
	}

	public int getDestinationFloor() {
		return DestinationFloor;
	}

	// generating setters
	public void setSourceFloor(int sourceFloor) {
		this.sourceFloor = sourceFloor;
	}

	public void setSourceFloor_Passenger(int sourceFloor_Passenger) {
		SourceFloor_Passenger = sourceFloor_Passenger;
	}

	public void setTop_Most_Floor(int top_Most_Floor) {
		Top_Most_Floor = top_Most_Floor;
	}

	public void setDestinationFloor(int destinationFloor) {
		DestinationFloor = destinationFloor;
	}

	
	// constructor
	public void Elevator (){
		setSourceFloor((int) (Math.random() * getTop_Most_Floor() + 1));
	}
	
	// Moving the Lift in upward direction
	public void go_Up_Wards() {
		while (getSourceFloor_Passenger() > getSourceFloor()) {
			if (sourceFloor < Top_Most_Floor)
				sourceFloor=sourceFloor+1;
		}
	}

	// Moving the Lift in downward direction
	public void go_Down_Wards() {
		while (getSourceFloor_Passenger() < getSourceFloor()) {
			if (sourceFloor > 0)
				sourceFloor=sourceFloor-1;
		}
	}

	// Which Floor the passenger is present at the movement
	public int which_Floor() {
		if (getSourceFloor_Passenger() == getSourceFloor()) {
			return 1;
		} 
		else if(getSourceFloor_Passenger() > getSourceFloor()) {
			go_Up_Wards();
			return 2;
		} 
		else if(getSourceFloor_Passenger() < getSourceFloor()) {
			go_Down_Wards();
			return 3;
		}
		return -1;
	}

	// Which floor the passenger desires to go
	public int Go_Floor_Number() {
		if(getDestinationFloor() == getSourceFloor()) {
			return 1;
		} 
		else if(getDestinationFloor() > getSourceFloor()) {
			go_Up_Wards();
			return 2;
		} 
		else if(getDestinationFloor() < getSourceFloor()) {
			go_Down_Wards();
			return 3;
		}
		return -1;
	}
}