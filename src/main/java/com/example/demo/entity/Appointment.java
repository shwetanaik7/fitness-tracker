package com.example.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.Range;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer appointment_id;
	
	@NotBlank
	@NotEmpty
	@Pattern(regexp = "[A-Za-z][A-Za-z\\s]+$")
	@Size(max=25)
	String name;
	
	@NotBlank
	@NotEmpty
	@Pattern(regexp = "^[0-9]+$")
	@Range(min=1)
	String age;
	
	@NotBlank
	@NotEmpty
	@Email
	String email;
	
	@NotBlank
	@NotEmpty
	@Pattern(regexp = "^[0-9]+$")
	@Size(max=12)
	String mobile_no;
	
	@NotBlank
	@NotEmpty
	String address_line1;
	
	String address_line2;
	
	@NotBlank
	@NotEmpty
	String city;
	
	@NotBlank
	@NotEmpty
	String state;
	
	@NotBlank
	@NotEmpty
	String country;
	
	@Size(max=7)
	@NotBlank(message = "pin is mandatory")
	@NotEmpty
	@Pattern(regexp = "^[1-9][0-9\s]+$")
	private String pin;
	
	@NotBlank
	@NotEmpty
	String trainer_preferance;
	
	@NotBlank
	@NotEmpty
	@Pattern(regexp = "^Yes$|^No$|^yes$|^no$")
	String psio_requirement;
	
	@NotBlank
	@NotEmpty
	String fitness_package;
	
	@NotBlank
	@NotEmpty
	String weeks;
	
	@NotBlank
	@NotEmpty
	@Pattern(regexp = "^[0-9]+$")
	String amount;

	public Integer getAppointment_id() {
		return appointment_id;
	}

	public void setAppointment_id(Integer appointment_id) {
		this.appointment_id = appointment_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getTrainer_preferance() {
		return trainer_preferance;
	}

	public void setTrainer_preferance(String trainer_preferance) {
		this.trainer_preferance = trainer_preferance;
	}

	public String getPsio_requirement() {
		return psio_requirement;
	}

	public void setPsio_requirement(String psio_requirement) {
		this.psio_requirement = psio_requirement;
	}

	public String getFitness_package() {
		return fitness_package;
	}

	public void setFitness_package(String fitness_package) {
		this.fitness_package = fitness_package;
	}

	public String getWeeks() {
		return weeks;
	}

	public void setWeeks(String weeks) {
		this.weeks = weeks;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
}
