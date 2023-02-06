package ru.gb.sales.service;

import ru.gb.sales.model.Order;
import ru.gb.sales.model.Status;

import java.util.List;

public interface OrderService {

    Order getOrder(long id);

    List<Order> getOrders();

    void addOrder(Order order);

    Order changeOrderStatus(Order order, Status status);
}
