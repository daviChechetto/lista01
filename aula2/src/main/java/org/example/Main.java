package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        exercicio1();
    }

    public static void exercicio1(){
        String[] nomes = {"davi", "igor", "brendon", "matheus", "Ayrton", "Daniel"};
        String[] sobrenomes = {"Westphal", "Schumacker", "Giovinasi", "Lauda", "Silva", "Magnussem"};
        String[] equipes = {"RedBull reacing F1 team", "Ferrari scuderi", "AMG Petronas Mercedes F1 team", "McLarem f1 team", "AWB Alpine f1 team", "Stake Sauber F1 team", "Aston Martin", "Haas", "Visa cash app bull racing", "Wilians"};
        String[] categorias = {"F1", "F2", "WEC - Prototipos", "Indycar", "Nascar", "Stock car"};

        Random aleatorio = new Random();
        aleatorio.nextInt(0, 5);



//        String nome = nomes[aleatorio.nextInt(nomes.length)];
//        String sobrenome = sobrenomes[aleatorio.nextInt(sobrenomes.length)];
//        String equipe = equipes[aleatorio.nextInt(equipes.length)];
//        String categoria = categorias[aleatorio.nextInt(categorias.length)];
//        short idade = (short) aleatorio.nextInt(20, 65);

        for (int i = 0; i < 10; i++) {
            Pilotos piloto = new Pilotos(
                    nomes[aleatorio.nextInt(nomes.length)],
                    sobrenomes[aleatorio.nextInt(sobrenomes.length)],
                    equipes[aleatorio.nextInt(equipes.length)],
                    categorias[aleatorio.nextInt(categorias.length)],
                    (short) aleatorio.nextInt(20, 65));

            piloto.exibePiloto();
        }
    }

}