package com.example.Recipebackend.Service;

import com.example.Recipebackend.Modal.Recipe;
import com.example.Recipebackend.Repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RecipeService {

    @Autowired
    RecipeRepository recipeRepository;

    public void addRecipe(Recipe recipe){
        recipeRepository.insert(recipe);
    }

    public List<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    public Recipe getById(UUID id) {
        return recipeRepository.findById(id).orElse(null);
    }
}
