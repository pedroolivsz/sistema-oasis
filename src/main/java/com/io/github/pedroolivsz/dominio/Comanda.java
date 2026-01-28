package com.io.github.pedroolivsz.dominio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Comanda {

    private int id;
    private int numeroMesa;
    private List<Product> products;
    private BigDecimal valorTotal;

    public Comanda(int id, int numeroMesa, BigDecimal valorTotal) {
        this.id = id;
        this.numeroMesa = numeroMesa;
        this.products = new ArrayList<>();
        this.valorTotal = valorTotal;
    }

    public Comanda() {
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public List<Product> getProdutos() {
        return products;
    }

    public void setProdutos(List<Product> products) {
        this.products = products;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

}
