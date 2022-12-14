package com.mipt.fullstack.spring.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String brand;
	private String model;
	private String color;
	private String registerNumber;
	@Column(name="`year`")
	private int year;
	private int price;
	


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner")
	@JsonIgnore
	@ToString.Exclude
	private Owner owner;

	public Car(String brand, String model, String color,
			String registerNumber, int year, int price, Owner owner) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registerNumber = registerNumber;
		this.year = year;
		this.price = price;
		this.owner = owner;
	}




}
