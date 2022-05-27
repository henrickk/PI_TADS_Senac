package Boosiness;

import java.util.Scanner;

public class asdsad {



static int menu(){
    int menu;

    Scanner entrada = new Scanner(System.in);

    do {
        System.out.println("Digite o número de 1 á 4 para escolher uma opções: ");

        System.out.println("1) Instruções");

        System.out.println("2) Jogar");

        System.out.println("3) Créditos");

        System.out.println("4) Sair");

        System.out.print("Digite: ");

        menu = entrada.nextInt();

        switch (menu) {
            case 1:
                System.out.println("=================================================");
                System.out.println("Instruções:\n ");

                System.out.println("Avalie currículos e avance as semanas pra ser promovido.");

                System.out.println("=================================================");

                break;
            case 2:
                System.out.println("=================================================");
                System.out.printf("Carregando jogo: [");
                System.out.println("==================]");
                break;
            case 3:
                System.out.println("=================================================");
                System.out.println("Créditos:");

                System.out.println("Jogo criador por: \n\n" +
                        "Felipe Brenner\n" +
                        "Gustavo Gonzalez\n" +
                        "Henrick Adrian\n" +
                        "Julio Honda\n" +
                        "Leonardo Fujimura\n");
                System.out.println("=================================================");
                break;
            case 4:
                System.out.println("=================================================");
                System.out.println("Sair");
                System.out.println("okay....");
                System.out.println("=================================================");
                break;
            default:
                System.out.println("Opção inválida");
        }

    } while (menu != 4 || menu != 2);

    return menu;

}

    public static void main(String[] args) {

    int escolha=menu();

        if (escolha == 4) {
            System.out.println("Te vejo por aí..");
        }else{
            System.out.println("aoooba");
        }
    }
}

