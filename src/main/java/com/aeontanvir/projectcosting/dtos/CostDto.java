package com.aeontanvir.projectcosting.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CostDto {
    private long id;
    private String title;
    private String description;
    private double amount;
}
