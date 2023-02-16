package ru.gb.sales.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@Data
public class Product {

    @Id
    private long id;

    private String name;

    private String article;

    @ManyToOne
    private Category category;

    private Status status;
}
