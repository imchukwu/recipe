package com.cimspace.recipe.services;

import com.cimspace.recipe.commands.RecipeCommand;
import com.cimspace.recipe.domain.Recipe;

import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);

}
