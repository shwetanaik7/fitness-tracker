package com.example.demo.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.AppointmentRepository;
import com.example.demo.entity.Appointment;

@Service
public class AppointmentService {
	AppointmentRepository appointmentRepository;

	public Iterable<Appointment> getAppointment() {
		return appointmentRepository.findAll();
	}

	public Optional<Appointment> getAppointment(Integer id) {
		return appointmentRepository.findById(id);
	}

	public void saveUser(@Valid Appointment appointment) {
		appointmentRepository.save(appointment);
	}
}
