import java.util.Scanner;

public class Aula2 {
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
        else
            System.out.println("Ano desconhecido");
        for (int i=0; i<placa.length(); i++);
        //placa com leagth retorna o tamanho da placa
        placa = placa.replace('a','*');
        placa = placa.replace('b','*');
        placa = placa.replace('c','*');
        placa = placa.replace('d','*');
        placa = placa.replace('e','*');
        placa = placa.replace('A','*');
        placa = placa.replace('B','*');
        placa = placa.replace('C','*');
        placa = placa.replace('D','*');
        placa = placa.replace('E','*');

        System.out.println("Placa alterada: "+ placa);
    }
}
