package academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.javacore.dominio.EblocosInicializacao;

public class Anime {
    private String nome;
    private int[] episodios ;

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i +1;

        }
        for (int episodio: this.episodios){
            System.out.println(episodio+" ");
        }
    }
}
