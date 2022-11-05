package com.mipt.fullstack.spring.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mipt.fullstack.spring.domain.model.Car;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Owner {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ownerid;
	private String firstname;
	private String lastname;

	public Owner(String firstname, String lastname) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
		}
	

	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="owner")
	@ToString.Exclude
	private List<Car> cars;
	

}
