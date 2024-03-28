package com.hexaware.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.hexaware.controller.*;
import com.hexaware.exception.PatientNumberNotFoundException;

public class Main {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String ch = null;
		IHospitalController hc = new HospitalControllerImpl();
		do {
			System.out.println("\n1. Get appointment by Id"
					+ "\n2. Get appointment for patient"
					+ "\n3. Get appointment for doctors"
					+ "\n4. Schedule appointment"
					+ "\n5. Update appointment"
					+ "\n6. Cancel appointment"
					+ "\n Enter your choice: ");
			if(sc.hasNext()) {
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				try {
					hc.getAppointmentById();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} catch (PatientNumberNotFoundException e1) {
					e1.printStackTrace();
				}
				break;
			case 2:
				try {
					hc.getAppointmentsForPatient();
				} 
				catch (PatientNumberNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					hc.getAppointmentsForDoctor();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} catch (PatientNumberNotFoundException e2) {
					e2.printStackTrace();
				}
				break;
			case 4:
				try {
					hc.scheduleAppointment();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				break;
			case 5:
				try {
					hc.updateAppointment();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				break;
			case 6:
				try {
					hc.cancelAppointment();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("Invalid choice");
			}
			}
			System.out.println("Enter y to continue: ");
			if(sc.hasNext()){
				ch = sc.next();
			}
		}
		while(ch.equalsIgnoreCase("Y"));
		
		System.out.println("Thank you for using our system");
		
		sc.close();
	}
}


//public void getAppointmentById();
//public void getAppointmentsForPatient();
//public void getAppointmentsForDoctor();
//public void scheduleAppointment();
//public void updateAppointment();
//public void cancelAppointment();