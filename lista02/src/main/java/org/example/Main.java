package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        gerarSenha();
    }

    public static void gerarSenha(){

        Random aleatorio = new Random();

        String[] alfanumericos = {
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y", "Z",
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"
        };

        String[] senha = {};

        for (int i = 0; i >= 8; i++){
            senha[i] = alfanumericos[aleatorio.nextInt(alfanumericos.length)];
        }
        System.out.println("Senhas:" + senha);




    }
}