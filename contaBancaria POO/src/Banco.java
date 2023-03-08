import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, agencia, numConta;
        double valor;
        System.out.println("Digite Nome: ");
        nome = ler.nextLine();
        System.out.println("Digite a agência: ");
        agencia = ler.next();
        System.out.println("Digite o numero da conta: ");
        numConta = ler.next();

        contaBancaria cli1 = new contaBancaria(nome, agencia, numConta);

        System.out.println("Digite o valor para depósito: ");
        valor = ler.nextDouble();
        cli1.depositar(valor);
        System.out.println("Saldo atual: "+cli1.mostaSaldo());

        System.out.println("Digite o valor para sacar: ");
        valor = ler.nextDouble();
        cli1.sacar(valor);

        System.out.println("Saldo atual: "+cli1.mostaSaldo());
    }
}
