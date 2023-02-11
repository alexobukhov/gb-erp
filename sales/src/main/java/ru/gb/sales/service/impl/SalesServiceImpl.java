package ru.gb.sales.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.sales.model.Category;
import ru.gb.sales.model.Order;
import ru.gb.sales.model.Product;
import ru.gb.sales.model.Status;
import ru.gb.sales.service.SalesService;

import java.util.List;

@Service
public class SalesServiceImpl implements SalesService {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Autowired
    private OrderServiceImpl orderService;

    @Autowired
    private ProductServiceImpl productService;

    @Override
    public Category getCategory(long id) {
        return categoryService.getCategory(id);
    }

    @Override
    public List<Category> getCategories() {
        return categoryService.getCategories();
    }

    @Override
    public void addCategory(Category category) {
        categoryService.addCategory(category);
    }

    @Override
    public Category changeCategoryStatus(Category category, Status status) {
        return categoryService.changeCategoryStatus(category, status);
    }

    @Override
    public Order getOrder(long id) {
        return orderService.getOrder(id);
    }

    @Override
    public List<Order> getOrders() {
        return orderService.getOrders();
    }

    @Override
    public void addOrder(Order order) {
        orderService.addOrder(order);
    }

    @Override
    public Order changeOrderStatus(Order order, Status status) {
        return orderService.changeOrderStatus(order, status);
    }

    @Override
    public Product getProduct(long id) {
        return productService.getProduct(id);
    }

    @Override
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @Override
    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    @Override
    public Product changeProductStatus(Product product, Status status) {
        return productService.changeProductStatus(product, status);
    }
}
