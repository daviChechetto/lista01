package org.example;

public class Personagem {
    String nome;
    int vida;
    int ataque;

    Personagem(String nome, int vida, int ataque){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;


    }

    void receberDano(int dano){
        if (dano >= this.vida){
            System.out.println("O personagem: " + this.nome + " foi derrotado! :/");
        } else {
            this.vida = vida - dano;
            System.out.println("Personagem: " + this.nome + "\nVida: " + this.vida);
        }
    }

    void atacar(Personagem inimigo, int ataque){
        System.out.println("O " + this.nome + " Atacou: " + inimigo.nome + " e deu: " + ataque);
        inimigo.receberDano(ataque);
    }

}
