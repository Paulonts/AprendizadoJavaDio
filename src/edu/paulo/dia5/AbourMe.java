package edu.paulo.dia5;

public class AbourMe {
    public static void main(String[] args) {

        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        //Para mudar as variaveis é so ir em run e entra em "add configuration";

        System.out.println("ola meu nome é " + nome + " " + sobrenome);
        System.out.println("tenho " + idade + " anos");
        System.out.println("minha altura é " + altura + "cm");

    }
}
