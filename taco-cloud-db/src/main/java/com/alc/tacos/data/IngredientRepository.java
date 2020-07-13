package com.alc.tacos.data;

import com.alc.tacos.Ingredient;


	public interface IngredientRepository {

	  Iterable<Ingredient> findAll();
	  
	  Ingredient findById(String id);
	  
	  Ingredient save(Ingredient ingredient);
	  
	}