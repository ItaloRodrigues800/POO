import java.util.Scanner;

public class ExercicioNOTAS {
    public static void main(String[] args){
        double n1, n2, merdia;
        Scanner entrada;
        entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextDouble();

        merdia = ((n1+n2)/2);

        if (merdia >=7)
            System.out.println("Aprovado com a media de: " +merdia);
        else if (merdia <=6) {
            System.out.println("Reprovado com a média de: " +merdia);

        }
    }
}
