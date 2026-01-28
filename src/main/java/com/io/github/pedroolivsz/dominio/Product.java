package com.io.github.pedroolivsz.dominio;

import java.math.BigDecimal;

public class Product {

    private int id;
    private int quantity;
    private String name;
    private BigDecimal unitValue;

    public Product(int id, String name, int quantity, BigDecimal unitValue) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.unitValue = unitValue;
    }

    public Product(String name, int quantity, BigDecimal unitValue) {
        this.quantity = quantity;
        this.name = name;
        this.unitValue = unitValue;
    }

    public Product() {

    }

    public BigDecimal totalValue() {
        return unitValue.multiply(BigDecimal.valueOf(quantity));
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(BigDecimal unitValue) {
        this.unitValue = unitValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                "| " + name +
                "| Quantidade: " + quantity +
                "| Valor unitário: " + unitValue;
    }
}
