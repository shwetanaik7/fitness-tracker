package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {

}
