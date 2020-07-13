package com.alc.tacos;

import lombok.Data;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*	Per the JSR 380 specification, the validation-api dependency contains the standard validation APIs:
	https://jcp.org/en/jsr/detail?id=303 based on this validations, needs to add a dependency in POM */

@Data
public class Taco {
	
	private Long id;
	
	private Date createdAt;
	
	@NotNull
	@Size(min=5, message= "Name must be at least 5 characters long")
	private String name; 
	
	@Size(min=1, message= "You must choose at least one ingredient")
	private List<Ingredient> ingredients;
}


