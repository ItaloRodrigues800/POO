import java.util.Scanner;

public class exercicios1 {
    public static void main(String[] args) {
        Scanner ler =new Scanner(System.in);
        System.out.println("Qual o tempo gasto da viagem:");
        int tempo = ler.nextInt();
        System.out.println("Qual a velocidade media: ");
        int velocidade = ler.nextInt();
        System.out.println("Qual a media de consumo:");
        int consumo = ler.nextInt();

        int distancia = velocidade*tempo;
        int combustivel = distancia / consumo;

        System.out.println("A distancia percorrida em KM foi de: "+distancia);
        System.out.println("O carro fez uma media por litro de:" +combustivel);
    }
}
