package com.example.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Appointment;
import com.example.demo.service.AppointmentService;


@RestController
public class AppointmentController {
	@Autowired
	AppointmentService appointmentService;
	
	@GetMapping("/appointment")
	Iterable<Appointment> getAppointment() {
		return appointmentService.getAppointment();
	}
	
	@GetMapping("/appointment/{id}")
	Optional<Appointment> getAppointments(@PathVariable("id") Integer id) {
		return appointmentService.getAppointment(id);
	}
	
	@PostMapping("/appointment")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createAppointment(@RequestBody @Valid Appointment appointment)
	{	
		appointmentService.saveUser(appointment);
	}
}
