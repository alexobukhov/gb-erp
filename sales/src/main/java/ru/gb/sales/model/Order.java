package ru.gb.sales.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Order {

    @Id
    private long id;

    private String name;

    private long productionOrder;

    @OneToMany
    private List<Product> products;

    private Status status;
}
