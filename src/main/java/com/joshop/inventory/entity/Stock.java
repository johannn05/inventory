package com.joshop.inventory.entity;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "stocks", schema = "inventory")
public class Stock {

    @Id
    @Column(name = "product_id")
    private UUID productId;

    @Column(name = "qty", nullable = false)
    private Integer qty;

    @Column(name = "reorder_threshold", nullable = false)
    private Integer reorderThreshold;

    @Column(name = "reorder_qty", nullable = false)
    private Integer reorderQty;

    // Getters and Setters

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getReorderThreshold() {
        return reorderThreshold;
    }

    public void setReorderThreshold(Integer reorderThreshold) {
        this.reorderThreshold = reorderThreshold;
    }

    public Integer getReorderQty() {
        return reorderQty;
    }

    public void setReorderQty(Integer reorderQty) {
        this.reorderQty = reorderQty;
    }
}
