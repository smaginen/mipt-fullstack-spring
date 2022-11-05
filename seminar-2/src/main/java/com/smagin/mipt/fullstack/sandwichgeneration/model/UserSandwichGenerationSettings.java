package com.smagin.mipt.fullstack.sandwichgeneration.model;

import com.smagin.mipt.fullstack.sandwichgeneration.IngredientKind;
import lombok.Data;

import java.util.List;

@Data
public class UserSandwichGenerationSettings {
    private Long userId;
    private List<IngredientKind> settings;
}
