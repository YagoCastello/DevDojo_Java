package academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.teste;

import academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Bintroducao.javacore.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5,6};
        calculadora.somaArray(numeros);

        calculadora.somaArgs(1,2,3,3,21,7);




    }
}
