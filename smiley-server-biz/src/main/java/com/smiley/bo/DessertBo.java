package com.smiley.bo;

import com.smiley.enums.DessertType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DessertBo {
    private Long id;
    private String name;
    private DessertType type;
    private List<DessertInfoBo> dessertInfo;

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class DessertInfoBo {
        private String flavor;
        private String size;
        private int price;
    }
}
