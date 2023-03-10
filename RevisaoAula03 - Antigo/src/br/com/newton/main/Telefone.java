package br.com.newton.main;

import br.com.newton.agenda.Contato;

import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {
        String nome;
        String numero;

        Contato contato = new Contato();
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome para contato: ");
        nome = ler.nextLine();
        System.out.println("Digite o numero de telefone: ");
        numero = ler.nextLine();

        if (numero.length()==9)
            System.out.println("Numero invalido");

    }
}

