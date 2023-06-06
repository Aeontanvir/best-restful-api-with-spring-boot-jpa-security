package com.aeontanvir.projectcosting.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cost {
    private long id;
    private String title;
    private String description;
    private double amount;
}
