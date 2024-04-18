package academy.devdojo.maratonaJava.introducao;

public class Aula04OperadoresDevDojo {
    public static void main(String[] args) {
        // +-*/
        int numero1 = 45;
        int numero2 = 63;

        int soma = numero1 + numero2;
        int subtracao = numero1 -numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 /(double) numero2;
        System.out.println("Soma entre "+numero1+" e "+numero2+ "é igual a "+soma);
        System.out.println("Subtração entre "+numero1+" e "+numero2+ "é igual a "+subtracao);
        System.out.println("Multiplicação entre "+numero1+" e "+numero2+ "é igual a "+multiplicacao);
        System.out.println("Divisão entre "+numero1+" e "+numero2+ "é igual a "+divisao);



        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30&& salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30&& salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta"+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta"+ isDentroDaLeiMenorQueTrinta);




    }
}
