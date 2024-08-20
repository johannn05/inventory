package com.joshop.inventory.controller;

import com.joshop.inventory.entity.Product;
import com.joshop.inventory.entity.Stock;
import com.joshop.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    // Endpoint to list all products
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return inventoryService.getAllProducts();
    }

    // Endpoint to list all stocks
    @GetMapping("/stocks")
    public List<Stock> getAllStocks() {
        return inventoryService.getAllStocks();
    }

    // Endpoint to get a product by ID
    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable UUID productId) {
        return inventoryService.getProductById(productId);
    }

    // Endpoint to get stock by product ID
    @GetMapping("/stocks/{productId}")
    public Stock getStockByProductId(@PathVariable UUID productId) {
        return inventoryService.getStockByProductId(productId);
    }
}
