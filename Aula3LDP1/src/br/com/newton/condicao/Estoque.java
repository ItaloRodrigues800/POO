package br.com.newton.condicao;
import java.util.Scanner;
public class Estoque {
    public static void main(String[] args) {
        int estoque;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Qual o estoque?");
        estoque = entrada.nextInt();
        if (estoque >100){
            System.out.println("Prodruto como quantidade suficiente!");
        } else if (estoque <100 && estoque >50) {
            System.out.println("!ALERTA! Avaliar possibilidade de novo pedido!");
        }
        else {
            System.out.println("ATENÇÃO! Faça um novo pedido.");
        }
    }
}
