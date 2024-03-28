package com.hexaware.controller;

import java.sql.SQLException;

import com.hexaware.exception.PatientNumberNotFoundException;

public interface IHospitalController {
	public void getAppointmentById() throws SQLException, PatientNumberNotFoundException;
	public void getAppointmentsForPatient() throws SQLException, PatientNumberNotFoundException;
	public void getAppointmentsForDoctor() throws SQLException, PatientNumberNotFoundException;
	public void scheduleAppointment() throws SQLException;
	public void updateAppointment() throws SQLException;
	public void cancelAppointment() throws SQLException;
}

