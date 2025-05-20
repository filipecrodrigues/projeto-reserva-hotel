package application;

import entities.Reserva;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan =  new Scanner(System.in);

        //criando um vetor nulo do tipo Reserva de 10 posições

        Reserva [] vetor = new Reserva[10];

        System.out.println("Quais os quartos podem ser alugados?");
        int numeroDeQuartos = scan.nextInt();

        //for para receber os dados do usuário
        for (int i = 1; i <= numeroDeQuartos; i++){
            System.out.println();
            System.out.println("Reserva "+ i+ ": ");
            System.out.println("Nome: ");
            scan.nextLine(); //limpeza de buffer
            String nome = scan.nextLine();
            System.out.println("Email: ");
            String email= scan.next();
            System.out.println("Quarto: ");
            int numeroDoQuarto = scan.nextInt();

            //instanciando o objeto Reserva e atribuido ao vetor na posição numero do quarto informado pelo usuário

            vetor[numeroDoQuarto] = new Reserva(nome,email);
        }
        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i =0; i < 10; i++){
            if (vetor[i] != null){
                System.out.println(i+ ": "+vetor[i]);
            }
        }

        scan.close();
    }
}