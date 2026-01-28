package com.io.github.pedroolivsz.controller;

import com.io.github.pedroolivsz.dominio.Product;
import com.io.github.pedroolivsz.service.ProductService;

import java.math.BigDecimal;
import java.util.List;

public class ProdutoController {
    private final ProductService productService;

    public ProdutoController(ProductService productService) {
        this.productService = productService;
    }

    public Product create(String nome, int quantidade, BigDecimal valorUnitario) {
        return productService.create(nome, quantidade, valorUnitario);
    }

    public Product update(int id, String nome, int quantidade, BigDecimal valorUnitario) {
        return productService.update(id, nome, quantidade, valorUnitario);
    }

    public void delete(int id) {
        productService.delete(id);
    }

    public List<Product> listAll() {
        return productService.listAll();
    }

    public Product findbyId(int id) {
        return productService.findById(id);
    }
}
