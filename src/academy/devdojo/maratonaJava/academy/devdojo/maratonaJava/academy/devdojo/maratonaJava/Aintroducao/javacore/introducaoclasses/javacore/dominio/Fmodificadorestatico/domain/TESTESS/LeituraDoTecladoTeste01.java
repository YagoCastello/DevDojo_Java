package academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.javacore.dominio.Fmodificadorestatico.domain.TESTESS;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo ");
        String nome = entrada.nextLine();
        System.out.println("Digite a sua idade abaixo ");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char sexo = entrada.next().charAt(0);
        System.out.println("----------------------------------");
        System.out.println("Nome"+nome);
        System.out.println("Idade"+idade);
        System.out.println("Sexo"+sexo);

    }
}
