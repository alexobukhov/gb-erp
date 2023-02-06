package ru.gb.sales.service;

import ru.gb.sales.model.Category;
import ru.gb.sales.model.Order;
import ru.gb.sales.model.Product;
import ru.gb.sales.model.Status;

import java.util.List;

public interface SalesService {

    Category getCategory(long id);

    List<Category> getCategories();

    void addCategory(Category category);

    Category changeCategoryStatus(Category category, Status status);

    Order getOrder(long id);

    List<Order> getOrders();

    void addOrder(Order order);

    Order changeOrderStatus(Order order, Status status);

    Product getProduct(long id);

    List<Product> getProducts();

    void addProduct(Product product);

    Product changeProductStatus(Product product, Status status);
}
