package academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.teste;

import academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Bintroducao.javacore.introducaoMetodos.dominio.NewEstudante;

public class EstudanteNovoTest01 {
    public static void main(String[] args) {
        NewEstudante estudante01 = new NewEstudante();
        NewEstudante estudante02 = new NewEstudante();


        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Katsumi";
        estudante02.idade = 21;
        estudante02.sexo = 'M';


        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);


        System.out.println("----------------");
        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);




    }
}
