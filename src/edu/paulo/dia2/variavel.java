package edu.paulo.dia2;

/*
byte idade = 123;
short ano = 2021;
int cep = 21070333
long cpf = 95845742566L; tem que terminar com L para o java identificar que é um long
float pi = 3.14F; tem que terminar com F para o java identificar que é um float
double salario = 8546.55;
*/
public class variavel {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;
        double desconto = 221.45;

        double salario = salarioMinimo - desconto;

        System.out.println("seu salario deu " + salario);
    }

}
