package edu.paulo.dia3;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        String nome1 = "Glayson";
        String nome2 = new String("Glayson");

        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 > numero2){
        System.out.println("a nossa condição é verdadeira");
        }else{
        System.out.println("a nossa condição é falsa");

        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);



    }
}
