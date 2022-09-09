package com.example.Recipebackend.Modal;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Document("recipe")
public class Recipe {
    @Id
    UUID id;
    String name;
    List<RecipeStep> recipeSteps;

    public Recipe(String name, List<RecipeStep> recipeSteps) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.recipeSteps = recipeSteps;
    }
}
