package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio03();
    }

    static void exemplo() {
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite o seu nome: ");
        String nome = leitor.nextLine();

        String menssagem = "Hello, " + nome + "!";
        System.out.print(menssagem);
    };

    static void execicio01() {
        System.out.print("Bem-vindo ao Sistema de Geração de Jogadores!");
    }
    static void execicio02() {
        String nome = "Davi";
        String cargo = "Dev Front-End";
        double salario = 1367.37;

        System.out.print("Nome: " + nome + "\n" + "Cargo: " + cargo + "\n" + "Salário: " + salario);
    }
    static void exercicio03(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String produto = reader.nextLine();

        System.out.print("Digite o código do produto: ");
        int codigo = Integer.parseInt(reader.nextLine());

        System.out.printf("Digite o valor do produto: ");
        double valor = Double.parseDouble(reader.nextLine());

        System.out.printf("Informe se há promoção: ");
        boolean promocao = Boolean.parseBoolean(reader.nextLine());

        System.out.print("Produto: " + produto + "\n" + "Código: " + codigo + "\n" + "Valor: " + valor + "\n" + "Promoção: " + promocao);
    }
    static void exercicio04(){
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite o valor da compra: ");
        double valor = Double.parseDouble(leitor.nextLine());

        if(valor > 100){
            valor = valor * 0.90;
        }

        System.out.printf(String.valueOf(valor));
    }

}
