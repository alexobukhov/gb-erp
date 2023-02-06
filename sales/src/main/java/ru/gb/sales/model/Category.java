package ru.gb.sales.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Category extends BaseEntity {

    @Id
    private long id;

    private String name;

    private Status status;
}
