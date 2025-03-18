package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorProduto gerenciador = new GerenciadorProduto();


        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por código");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("Opção de cadastro selecionada.");
                    System.out.println("Nome produto: ");
                    String nome = scanner.nextLine();
                    System.out.println("Codigo:");
                    int codigo = scanner.nextInt();
                    System.out.println("Preço:");
                    double preco = scanner.nextDouble();

                    gerenciador.cadastrarProduto(new Produto(codigo, preco, nome));
                    break;
                case 2:
                    System.out.println("Opção de busca selecionada.");
                    System.out.println("Insira o código: ");
                    int codigoBuscar = scanner.nextInt();

                    gerenciador.buscarProduto(codigoBuscar);

                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
        scanner.close();
    }
}