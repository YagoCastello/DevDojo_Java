package academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.javacore.dominio.Fmodificadorestatico.domain.TESTESS;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0)== ' '){
            System.out.println("SIM");
        }else {
            System.out.println("N");
        }

    }
}
