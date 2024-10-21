package edu.paulo.dia3;

public class OperadoresTenarios {
    public static void main(String[] args) {
        
        int a, b;

        a = 5;
        b = 6;
        String resultado = "";

        if(a == b){
            resultado = "verdadeiro";
        }else{
            resultado = "falso";
        }
        System.out.println(resultado);

        //Abreviação If / Else
        resultado = a==b ?"verdadeira" : "falso";
        System.out.println(resultado);
        
    }
}
