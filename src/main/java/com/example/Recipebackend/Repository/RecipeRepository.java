package com.example.Recipebackend.Repository;

import com.example.Recipebackend.Modal.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RecipeRepository extends MongoRepository<Recipe,UUID> {
}
