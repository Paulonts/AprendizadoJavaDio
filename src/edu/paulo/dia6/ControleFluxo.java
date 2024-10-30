package edu.paulo.dia6;

public class ControleFluxo {
    public static void main(String[] args){
        double saldo = 25.0;
        double valorSolicitado = 25.0;

        System.out.println("Seu saldo é " + saldo);


        if (valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Valor solicitado: " + valorSolicitado);
            System.out.println("saldo atual: " + saldo);
        }else{
            System.out.println("Você não possui saldo");
        }
    }
}
