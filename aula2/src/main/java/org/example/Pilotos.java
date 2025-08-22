package org.example;

public class Pilotos {
    // Atributos
    String nome = "Davi";
    String sobrenome = "Westphal";
    String equipe = "Red bull";
    String categoria = "F1";
    short idade = 20;

    // Construtor
    Pilotos(String nome, String sobrenome, String equipe, String categoria, short idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.equipe = equipe;
        this.categoria = categoria;
        this.idade = idade;
    }

    // Método

    void exibePiloto(){
        System.out.printf(
                nome + " "
                + sobrenome
                + " é um amante do automobilismo com "
                + idade + " anos que atua na categoria da "
                + categoria + " trabalhando atualmente na equipe "
                + equipe + "\n");
    }
}
