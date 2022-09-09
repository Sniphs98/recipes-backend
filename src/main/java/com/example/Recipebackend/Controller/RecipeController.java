package com.example.Recipebackend.Controller;

import com.example.Recipebackend.Modal.Recipe;
import com.example.Recipebackend.Modal.RecipeStep;
import com.example.Recipebackend.Modal.Unit;
import com.example.Recipebackend.Service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/recipe")
@CrossOrigin
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @PostMapping("/add")
    public ResponseEntity addRecipe(@RequestBody Recipe recipe){
        recipeService.addRecipe(createTestRecipe());
        recipeService.addRecipe(recipe);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity getRecipe(@PathVariable UUID id){
        return ResponseEntity.ok(recipeService.getById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Recipe>> getAllRecipes(){
        return ResponseEntity.ok(recipeService.getAll());
    }

    private Recipe createTestRecipe(){
        List<RecipeStep> test = new ArrayList();
        var recipeStepTest = new RecipeStep(2, Unit.SHOT,"test","test");
        var recipeStepTest2 = new RecipeStep(12, Unit.ML,"tasdasd","üppvycv");
        var recipeStepTest3 = new RecipeStep(5, Unit.PIECE,"asdadas","qöwlöqw");
        var recipeStepTest4 = new RecipeStep(6, Unit.SHOT,"asdasd","asd");
        test.add(recipeStepTest);
        test.add(recipeStepTest2);
        test.add(recipeStepTest3);
        test.add(recipeStepTest4);
        Recipe recipe = new Recipe("test",test);

        System.out.println("---------------------------------------------------------------------");
        System.out.println(recipe);
        System.out.println("---------------------------------------------------------------------");

        return recipe;
    }
}
