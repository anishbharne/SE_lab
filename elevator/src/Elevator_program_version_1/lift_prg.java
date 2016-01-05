package Elevator_program_version_1;
/*
 	Implement an Elevator simulation that will create an elevator that passes through different floors of a building and services user requests.
 	Assume one user request is handled at one time(no parallel requests).The program should make use of OO concepts.
*/

import java.io.*;
public class lift_prg {
	public static void main(String args[]) throws IOException {
		
		// constructor
		lift obj=new lift();
		
		// opens the doors of lift
		obj.open_The_Doors();
		
		System.out.println("Enter Your Current floor");
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		String pf=stdin.readLine();
		int a= Integer.parseInt(pf);
		
		System.out.println("Enter Your Destination floor");
		BufferedReader stdin1=new BufferedReader(new InputStreamReader(System.in));
		String df=stdin1.readLine();
		
		int b=Integer.parseInt(df);
		obj.go_To_Floor(b);

		lift obj1=new lift();
		obj1.go_Up();
		obj1.go_Down();
		obj1.display(a);
		obj1.close_The_Doors();
	}
}