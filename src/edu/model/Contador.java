package edu.model;

import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt(),
            parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            e.printStackTrace();
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
