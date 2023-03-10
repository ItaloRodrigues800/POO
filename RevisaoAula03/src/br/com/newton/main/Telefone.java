package br.com.newton.main;

import br.com.newton.agenda.Contato;

import javax.swing.*;
import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String numero = JOptionPane.showInputDialog("Digite o numero: ");

        if (numero.length()>=10)
            JOptionPane.showMessageDialog(null,"Telefone Invalido!" + numero, "INFORMAÇÃO", JOptionPane.ERROR_MESSAGE);
        else if (numero.length()==9) {
            JOptionPane.showMessageDialog(null, "Telefone valido!"+ numero, "INFORMAÇÃO",JOptionPane.QUESTION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "Telefone Invalido!"+ numero,"INFORMAÇÃO",JOptionPane.WARNING_MESSAGE);

    }
}

