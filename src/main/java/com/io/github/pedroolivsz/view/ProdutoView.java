package com.io.github.pedroolivsz.view;

import com.io.github.pedroolivsz.controller.ProdutoController;
import com.io.github.pedroolivsz.dominio.Product;
import com.io.github.pedroolivsz.repository.RepositoryException;
import com.io.github.pedroolivsz.validation.ProductException;

import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.util.List;

public class ProdutoView {
    private final ProdutoController produtoController;

    public ProdutoView(ProdutoController produtoController) {
        this.produtoController = produtoController;
    }

    public void createProduct() {
        try {
            String nome = JOptionPane.showInputDialog(
                    null,
                    "Nome:",
                    "Cadastro de produto:",
                    JOptionPane.PLAIN_MESSAGE
            );
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Quantidade:",
                    "Cadastro de produto:",
                    JOptionPane.PLAIN_MESSAGE)
            );
            BigDecimal valorUnitario = BigDecimal.valueOf(
                    Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Valor unitário:",
                            "Cadastro de produto:",
                            JOptionPane.PLAIN_MESSAGE))
            );

            Product productCreated = produtoController.create(nome, quantidade, valorUnitario);

            JOptionPane.showMessageDialog(
                    null,
                    "Nome: " + productCreated.getName() + "\n" +
                            "Quantidade: " + productCreated.getQuantity() + "\n" +
                            "Valor unitário: R$" + productCreated.getUnitValue() + "\n" +
                            "Adicionado com sucesso ao estoque!"
            );
        } catch (ProductException | RepositoryException exception) {
            JOptionPane.showMessageDialog(
                    null,
                    exception.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    }
    public void updateProduct() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Id do produto:",
                    "Edição de produto",
                    JOptionPane.PLAIN_MESSAGE)
            );
            String nome = JOptionPane.showInputDialog(
                    null,
                    "Nome:",
                    "Cadastro de produto:",
                    JOptionPane.PLAIN_MESSAGE
            );
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Quantidade:",
                    "Cadastro de produto:",
                    JOptionPane.PLAIN_MESSAGE)
            );
            BigDecimal valorUnitario = BigDecimal.valueOf(Double.parseDouble(JOptionPane.showInputDialog(
                    null,
                    "Valor unitário:",
                    "Cadastro de produto:",
                    JOptionPane.PLAIN_MESSAGE)
            ));

            Product updated = produtoController.update(id, nome, quantidade, valorUnitario);

            JOptionPane.showMessageDialog(
                    null,
                    "Nome: " + updated.getName() + "\n" +
                    "Quantidade: " + updated.getQuantity() + "\n" +
                    "Valor unitário: R$" + updated.getUnitValue() + "\n" +
                    "Editado com sucesso!"
            );
        } catch (ProductException | RepositoryException exception) {
            JOptionPane.showMessageDialog(
                    null,
                    exception.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void deleteProduct() {
        try {
            int id = Integer.parseInt(
                    JOptionPane.showInputDialog(
                    null,
                    "Id do produto:",
                    "Deletar produto",
                    JOptionPane.PLAIN_MESSAGE
                    ));

            produtoController.delete(id);

            JOptionPane.showMessageDialog(
                    null,
                    "O produto de ID: " + id + " foi excluido com sucesso",
                    "Confirmação",
                    JOptionPane.PLAIN_MESSAGE
            );
        } catch (ProductException | RepositoryException exception) {
            JOptionPane.showMessageDialog(
                    null,
                    exception.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void listAllProducts() {
        List<Product> products = produtoController.listAll();

        if(products.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Lista vazia",
                    "Lista de produtos",
                    JOptionPane.PLAIN_MESSAGE
            );
            return;
        }

        StringBuilder listaProdutos = new StringBuilder();

        for(Product product : products) {
            listaProdutos.append(product).append("\n");
        }

        JOptionPane.showMessageDialog(
                null,
                listaProdutos,
                "Lista de produtos",
                JOptionPane.PLAIN_MESSAGE
        );
    }

    public void findProductById() {
        try {
            int id = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            "Id do produto:",
                            "Procurar produto por id",
                            JOptionPane.PLAIN_MESSAGE
                    ));

            Product product = produtoController.findbyId(id);

            JOptionPane.showMessageDialog(
                    null, product,
                    "Produto encontrado",
                    JOptionPane.PLAIN_MESSAGE
            );
        } catch (ProductException | RepositoryException exception) {
            JOptionPane.showMessageDialog(
                    null,
                    exception.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
