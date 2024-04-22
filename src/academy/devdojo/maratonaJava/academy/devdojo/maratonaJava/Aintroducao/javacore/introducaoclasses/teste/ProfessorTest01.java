package academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.teste;

import academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.javacore.dominio.Professor;

public class ProfessorTest01 {

    public static void main(String[] args) {
        Professor professor=new Professor();
        professor.nome = "Mestre kami";
        professor.idade = 72;
        professor.sexo = 'M';


        System.out.println("Nome : "+professor.nome+", idade: "+ professor.idade+" , sexo:"+ professor.sexo);
    }

}
