package com.smiley.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DessertRecipeBo {
    private Long id;
    private Long dessertId;
    private String name;
    private List<RecipeBo> recipes;
}
