package ru.gb.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.sales.model.Order;
import ru.gb.sales.model.Status;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    public Order findByNameContaining(String searchString);

    public List<Order> findByProductionOrder(long productionOrderId);

    public List<Order> findByStatus(Status status);
}
