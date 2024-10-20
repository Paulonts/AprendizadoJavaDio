package edu.paulo.dia1;
public class MinhaCLasse {
    public static void main(String[] args){
        String primeiroNome = "Glayson";
        String segundoNome = "Rafael";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "resultado no método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
