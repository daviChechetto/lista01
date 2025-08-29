package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Davi", 100, 2);
        Personagem vilao = new Personagem("Brendon", 2, 1);

        Random aleatorio = new Random();

        // heroi.receberDano(123);
        heroi.atacar(vilao, aleatorio.nextInt(heroi.ataque + 1));

    }
}
