package edu.paulo.dia3;

public class OperadoresAritimetricos {
    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1+1+1+ "1";
        System.out.println(concatenacao);

        concatenacao = 1 +"1"+ 1 +"1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

    }
}
