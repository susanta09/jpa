package com.example.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String city;
	private String state;
	private String type;
	private Integer empId;
	public Address(Integer id, String city, String state, String type) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.type = type;
	}
System.out.println("rama");

}
