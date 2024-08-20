package com.joshop.inventory.service;

import com.joshop.inventory.entity.Product;
import com.joshop.inventory.entity.Stock;

import java.util.List;
import java.util.UUID;

public interface InventoryService {
    List<Product> getAllProducts();
    List<Stock> getAllStocks();
    Product getProductById(UUID productId);
    Stock getStockByProductId(UUID productId);
}
