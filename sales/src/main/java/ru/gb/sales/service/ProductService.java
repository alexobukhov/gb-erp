package ru.gb.sales.service;

import ru.gb.sales.model.Product;
import ru.gb.sales.model.Status;

import java.util.List;

public interface ProductService {

    Product getProduct(long id);

    List<Product> getProducts();

    void addProduct(Product product);

    Product changeProductStatus(Product product, Status status);
}
