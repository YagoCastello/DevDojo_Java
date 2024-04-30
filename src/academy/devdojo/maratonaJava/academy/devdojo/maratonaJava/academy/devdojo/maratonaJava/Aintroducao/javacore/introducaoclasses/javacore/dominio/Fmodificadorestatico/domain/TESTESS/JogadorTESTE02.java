package academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.javacore.dominio.Fmodificadorestatico.domain.TESTESS;

import academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.javacore.dominio.Fmodificadorestatico.domain.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.javacore.dominio.Fmodificadorestatico.domain.Gassociacao.dominio.Time;

public class JogadorTESTE02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }}
