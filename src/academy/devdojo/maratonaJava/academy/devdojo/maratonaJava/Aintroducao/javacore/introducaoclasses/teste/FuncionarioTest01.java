package academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.teste;

import academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Bintroducao.javacore.introducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("kabuto");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1562,2013.56,1845});

        funcionario.imprime();
        funcionario.imprimeMediaSalario();
    }
}
