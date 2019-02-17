package com.smiley.dto.dessert;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DessertSizeDto {
    private Long id;
    private Long dessertId;
    private Long flavorId;
    private String name;
}
