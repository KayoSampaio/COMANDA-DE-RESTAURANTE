//COMANDA E RESTAURANTE MODULO - 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {

            System.out.println("===== SABOR E ARTE =====");
            System.out.println("1 - Picanha         R$25,00");
            System.out.println("2 - Lasanha         R$20,00");
            System.out.println("3 - Strogonoff      R$18,00");
            System.out.println("4 - Bife acebolado  R$15,00");
            System.out.println("5 - Pão com ovo     R$5,00");
            System.out.println("=========================");

            System.out.println("Digite o código do prato: ");
            int codigo = scanner.nextInt();

            double valor = 0;
            String prato = "";

            switch (codigo) {
                case 1:
                    prato = "Picnha";
                    valor = 25.00;
                    break;

                case 2:
                    prato = "Lasanha ";
                    valor = 20.00;
                    break;

                case 3:
                    prato = "Strogonoff";
                    valor = 18.00;
                    break;

                case 4:
                    prato = "Bife acebolado";
                    valor = 15.00;
                    break;

                case 5:
                    prato = "Pão com ovo";
                    valor = 5.00;
                    break;

                default:
                    System.out.println("Código inválido!");
                    continue;
                }

                total += valor;

                System.out.printf("%s adicionado! Valor: R$ %.2f%n", prato, valor);
                System.out.printf("Total acumulado: R$ %.2f%n", total);

                System.out.print("Deseja adicionar outro prato? (s/n): ");
                continuar = scanner.next();

                System.out.println("\n===== COMANDA FINALIZADA =====");
                System.out.printf("Total a pagar: R$ %.2f%n", total);
                System.out.println("==============================");

                scanner.close();




        }
    }
}