package edu.paulo.dia3;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }else{
            System.out.println("fim");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições são verdadeiras");
        }else{
            System.out.println("fim");
        }

        if(condicao1 && (7>4)){
            System.out.println("As duas condições são verdadeiras");
        }else{
            System.out.println("fim");
        }


    }
}
