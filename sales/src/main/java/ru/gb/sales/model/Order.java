package ru.gb.sales.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
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
