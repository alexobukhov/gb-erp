package ru.gb.sales.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class Category {

    @Id
    private long id;

    private String name;

    private Status status;
}
