package com.joshop.inventory.service;

import com.joshop.inventory.entity.Product;
import com.joshop.inventory.entity.Stock;
import com.joshop.inventory.repository.ProductRepository;
import com.joshop.inventory.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class InventoryServiceImpl implements InventoryService {

    private final ProductRepository productRepository;
    private final StockRepository stockRepository;

    @Autowired
    public InventoryServiceImpl(ProductRepository productRepository, StockRepository stockRepository) {
        this.productRepository = productRepository;
        this.stockRepository = stockRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Product getProductById(UUID productId) {
        return productRepository.findByProductId(productId);
    }

    @Override
    public Stock getStockByProductId(UUID productId) {
        return stockRepository.findById(productId).orElse(null);
    }
}
