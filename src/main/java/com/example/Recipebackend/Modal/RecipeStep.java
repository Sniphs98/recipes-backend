package com.example.Recipebackend.Modal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RecipeStep {

    int amount;
    Unit unit_of_measurement;
    String name;
    String preparation;

}
