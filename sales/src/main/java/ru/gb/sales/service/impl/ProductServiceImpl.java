package ru.gb.sales.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.sales.model.Product;
import ru.gb.sales.model.Status;
import ru.gb.sales.repository.ProductRepository;
import ru.gb.sales.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product getProduct(long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.saveAndFlush(product);
    }

    @Override
    public Product changeProductStatus(Product product, Status status) {
        Product updateProduct = productRepository.findById(product.getId()).orElse(null);
        if (updateProduct == null) {
            return null;
        }
        updateProduct.setStatus(status);
        return updateProduct;
    }
}
