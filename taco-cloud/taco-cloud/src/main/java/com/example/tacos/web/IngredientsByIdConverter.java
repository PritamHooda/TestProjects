package com.example.tacos.web;

import com.example.tacos.Ingredient;
import com.example.tacos.data.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class IngredientsByIdConverter implements Converter<String, Ingredient> {

    private final IngredientRepository ingredientRepo;
    @Autowired
    public IngredientsByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String id) {

        return ingredientRepo.findById(id).orElse(null);
    }
}
