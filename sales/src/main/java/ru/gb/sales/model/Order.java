package ru.gb.sales.model;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@jakarta.persistence.Entity
@NoArgsConstructor
@Data
public class Order extends BaseEntity {

    @Id
    private long id;

    private String name;

    private long productionOrder;

    @OneToMany
    private List<Product> products;

    private Status status;
}
