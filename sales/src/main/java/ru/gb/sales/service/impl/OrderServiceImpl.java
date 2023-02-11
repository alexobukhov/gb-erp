package ru.gb.sales.service.impl;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.sales.model.Order;
import ru.gb.sales.model.Status;
import ru.gb.sales.repository.OrderRepository;
import ru.gb.sales.service.OrderService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order getOrder(long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @Override
    public void addOrder(Order order) {
        orderRepository.saveAndFlush(order);
    }

    @Override
    @Transactional
    public Order changeOrderStatus(Order order, Status status) {
        Order updateOrder = orderRepository.findById(order.getId()).orElse(null);
        if (updateOrder == null) {
            return null;
        }
        updateOrder.setStatus(status);
        return updateOrder;
    }
}
