package com.trade.model;

import javax.validation.constraints.Min;

public class ShoppingCartItem {

    @Min(1)
    private long id;

    @Min(1)
    private long productId;

    @Min(1)
    private long quantity;

    @Min(1)
    private long userId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "ShoppingCartItem{" +
                "id=" + id +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", userId=" + userId +
                '}';
    }
}
