package edu.paulo.dia5;

import java.util.Locale;
import java.util.Scanner;

public class ImprimirJava {
    public static void main(String[] args) {

        //criando obj scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome;
        String sobrenome;
        int idade = 0;
        double altura = 0;


        System.out.println("Qual seu nome: ");
        nome = scanner.next();

        System.out.println("Qual é seu sobrenome: ");
        sobrenome = scanner.next();

        System.out.println("Qual é sua idade: ");
        idade = scanner.nextInt();

        System.out.println("Qual é sua altura: ");
        altura = scanner.nextDouble();


        System.out.println("ola meu nome é " + nome + " " + sobrenome);
        System.out.println("tenho " + idade + " anos");
        System.out.println("minha altura é " + altura + "cm");

    }
}
