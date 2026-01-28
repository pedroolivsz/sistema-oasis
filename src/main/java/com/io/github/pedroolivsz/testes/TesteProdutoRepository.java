package com.io.github.pedroolivsz.testes;

import com.io.github.pedroolivsz.controller.ProdutoController;
import com.io.github.pedroolivsz.repository.ProdutoRepository;
import com.io.github.pedroolivsz.service.ProductService;
import com.io.github.pedroolivsz.view.ProdutoView;

public class TesteProdutoRepository {

    public static void main(String[] args) {
        ProdutoRepository produtoRepository = new ProdutoRepository();
        ProductService productService = new ProductService(produtoRepository);
        ProdutoController produtoController = new ProdutoController(productService);
        ProdutoView produtoView = new ProdutoView(produtoController);

        //produtoView.createProduct();
        //produtoView.updateProduct();
        //produtoView.deleteProduct();
        //produtoView.listAllProducts();
        produtoView.findProductById();
    }

}
