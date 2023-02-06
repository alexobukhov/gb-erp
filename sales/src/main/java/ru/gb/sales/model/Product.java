package ru.gb.sales.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@jakarta.persistence.Entity
@NoArgsConstructor
@Data
public class Product extends BaseEntity {

    @Id
    private long id;

    private String name;

    private String article;

    @ManyToOne
    private Category category;

    private Status status;
}
