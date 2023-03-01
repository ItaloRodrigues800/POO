import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ano = 2000;
        String placa;
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite a Placa: ");
        placa = ler.nextLine();
        System.out.println("Digite o ano: ");
        ano = ler.nextInt();
        if (ano <= 2010)
            System.out.println("Carro Velho");
        else if (ano <=2021)
            System.out.println("Carro semi-novo");
        else if (ano==2022)
            System.out.println("Carro novo");
    }
}




