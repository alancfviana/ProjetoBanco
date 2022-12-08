package ada.viana.banco.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LerTeclado {

    public static int getNumero() {
            int valor;
            do {

                try {
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Digite um número inteiro: ");
                    valor =  entrada.nextInt();
                    return valor;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida!!!!!");
                }
            }while(true);
        }
    }

