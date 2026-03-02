package org.example.gestiondesproduits.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    @NotEmpty
    @Size(min = 2, max = 60)
    private String name;
    @NotEmpty
    @Size(min = 2, max = 60)
    private String Category;
    @Min(0)
    private double price;
    @Min(1)
    private double quantity;

}
