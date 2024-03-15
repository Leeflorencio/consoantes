package com.br.alura;

import java.util.ArrayList;
import java.util.Scanner;

public class Consoante {

    public static void main(String[] args) {

        ArrayList<String> letras = new ArrayList<>(10);
        ArrayList<String> consoantes = new ArrayList<>(10);
        String letra = "";

        int consoanteIncremento = 0;
        int vogal = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe até 10 caracteres: ");
            letra = sc.next();
            letras.add(letra);
        }

        for (String caracter : letras) {
            if (!caracter.equalsIgnoreCase("a") && !caracter.equalsIgnoreCase("e")
                    && !caracter.equalsIgnoreCase("i") && !caracter.equalsIgnoreCase("o")
                    && !caracter.equalsIgnoreCase("u")) {
                consoanteIncremento++;
                consoantes.add(caracter);
            } else {
                vogal++;
            }
        }

        System.out.println("Todas as letras informadas: " + letras);
        System.out.println("Total de consoantes: " + consoanteIncremento);
        System.out.println("Consoantes: " + consoantes);
        System.out.println("Vogais: " + vogal);

    }

}
