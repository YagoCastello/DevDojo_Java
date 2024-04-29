package academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.javacore.dominio.EblocosInicializacao.testesNovo;

import academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.javacore.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW",280);
        Carro c2 = new Carro("porsche",320);
        Carro c3 = new Carro("opala",180);
        Carro c4 = new Carro("camarro",210);
        c1.imprime();
        c2.imprime();
        c3.imprime();
        c4.imprime();
    }
}
