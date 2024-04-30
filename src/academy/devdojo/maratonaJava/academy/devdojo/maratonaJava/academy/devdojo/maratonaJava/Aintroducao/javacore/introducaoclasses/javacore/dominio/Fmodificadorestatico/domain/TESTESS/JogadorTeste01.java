package academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.javacore.dominio.Fmodificadorestatico.domain.TESTESS;

import academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.javacore.dominio.Fmodificadorestatico.domain.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Garincha");
        Jogador jogador3 = new Jogador("Zico");
        Jogador[] jogadores = {jogador1,jogador2,jogador3};

        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
