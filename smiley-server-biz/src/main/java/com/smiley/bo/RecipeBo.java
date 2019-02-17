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
public class RecipeBo {
    private Long id;
    private String name;
    private List<RecipeMaterialBo> materials;

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class RecipeMaterialBo {
        private Long id;
        private String name;
        private String unit;
        private Integer price;
        private Integer quantity;
    }
}
