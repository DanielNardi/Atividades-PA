package org.example;

import java.util.ArrayList;

public class GerenciadorProduto {

    ArrayList<Produto> ListaProdutos = new ArrayList<>();

   public void cadastrarProduto(Produto produto) {
       ListaProdutos.add(produto);
   }

   public void buscarProduto(int codigo) {

       Produto produto = null;

       for (Produto p : ListaProdutos) {
       if(codigo == p.getCodigo()) {
           produto = p;
           break;
            }
       }


       if(produto != null) {
           System.out.println("Produto encontrado: " );
           produto.exibir();
       } else {
           System.out.println("Produto não encontrado!");
       }
   }
}
