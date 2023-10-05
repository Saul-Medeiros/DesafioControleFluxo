package edu.model;

import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Informe o segundo número: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois)
    throws ParametrosInvalidosException {
        if (parametroDois < parametroUm)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

}
